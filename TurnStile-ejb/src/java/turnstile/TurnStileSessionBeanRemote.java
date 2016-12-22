package turnstile;

import javax.ejb.Remote;

@Remote
public interface TurnStileSessionBeanRemote {

    public String checkPerson(Integer Id);
    public String countPeople();
    public String findPerson(String firstName, String lastName);
    void addPerson(String firstName, String lastName, boolean isHere);
    
}
