package turnstile;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "CARD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Card.findAll", query = "SELECT c FROM Card c")
    , @NamedQuery(name = "Card.findAllHere", query = "SELECT c FROM Card c WHERE c.ishere = :param")
    , @NamedQuery(name = "Card.findById", query = "SELECT c FROM Card c WHERE c.id = :id")  
    , @NamedQuery(name = "Card.findByFirstname", query = "SELECT c FROM Card c WHERE c.firstname = :firstname")
    , @NamedQuery(name = "Card.findByLastname", query = "SELECT c FROM Card c WHERE c.lastname = :lastname")
    , @NamedQuery(name = "Card.findByFullname", query = "SELECT c FROM Card c WHERE c.firstname = :firstname AND c.lastname = :lastname")
    , @NamedQuery(name = "Card.findByIshere", query = "SELECT c FROM Card c WHERE c.ishere = :ishere")})


public class Card implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;
    @Size(max = 30)
    @Column(name = "FIRSTNAME")
    private String firstname;
    @Size(max = 30)
    @Column(name = "LASTNAME")
    private String lastname;
    @Basic(optional = false)
    @Column(name = "ISHERE")
    private Boolean ishere;

    public Card() {
    }

    public Card(Integer id) {
        this.id = id;
    }

    public Card(Integer id, Boolean ishere) {
        this.id = id;
        this.ishere = ishere;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Boolean getIshere() {
        return ishere;
    }

    public void setIshere(Boolean ishere) {
        this.ishere = ishere;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Card)) {
            return false;
        }
        Card other = (Card) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "turnstile.Card[ id=" + id + " ]";
    }
    
}
