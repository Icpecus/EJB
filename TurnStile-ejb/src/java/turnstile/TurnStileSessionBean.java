package turnstile;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class TurnStileSessionBean implements TurnStileSessionBeanRemote, TurnStileSessionBeanLocal {

    @PersistenceContext(unitName = "TurnStile-ejbPU")
    private EntityManager em;
    

    @Override
    public String countPeople() {
        Query query = em.createNamedQuery("Card.findAllHere").setParameter("param", true);
        List card = query.getResultList();
        String str = String.valueOf(card.size());
        return str;
    }

    @Override
    public String checkPerson(Integer Id) {
        Query query = em.createNamedQuery("Card.findById");
        query.setParameter("id", Id);
        List card = query.getResultList();
        if (card.size() > 0) {
            boolean isHere;
            String str;
            isHere = ((Card) card.get(0)).getIshere();
            str = ((Card) card.get(0)).getFirstname() + " " + ((Card) card.get(0)).getLastname();
            if (isHere == false) {
                str = "HELLO, " + str;
            } else {
                str = "GOODBYE, " + str;
            }
            ((Card) card.get(0)).setIshere(!isHere);

            return str + "!";
        } else {
            return "You can't go! Sorry...";
        }
    }
    
    @Override
    public String findPerson(String firstName, String lastName) {
       Query query = em.createNamedQuery("Card.findByFullname");
        query.setParameter("firstname", firstName);
        query.setParameter("lastname", lastName);
        List card = query.getResultList();
        if (card.size() > 0) {
            boolean here = ((Card) card.get(0)).getIshere();
            if (here == false) {
                return "NOT HERE";
            } else {
                return "HERE";
            }
        } else{
            return "No such person in base";
        }
    }

    public void persist(Object object) {
        //em.persist(object);
    }

    @Override
    public void addPerson(String firstName, String lastName, boolean isHere) {
        Card card = new Card();
        card.setFirstname(firstName);
        card.setLastname(lastName);
        card.setIshere(isHere);
        em.persist(card);
    }
}
