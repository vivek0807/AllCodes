package hibernate.Mapping;
import javax.persistence.Entity;// from hibernate jar file
import javax.persistence.*;// from hibernate jar file
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;

@Entity
class BonusCard {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int cardNo;
    private String cardType;
    private int points;

    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public int getCardNo() {
        return cardNo;
    }
    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }
    public String getCardType() {
        return cardType;
    }
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

}
@Entity
class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int custId;
    private String custName;
    private String custAddress;

    @OneToOne(cascade = CascadeType.ALL)
    private BonusCard bonusCard;

    public BonusCard getBonusCard() {
        return bonusCard;
    }

    public void setBonusCard(BonusCard bonusCard) {
        this.bonusCard = bonusCard;
    }

    public int getCustId() {
        return custId;
    }
    public void setCustId(int custId) {
        this.custId = custId;
    }
    public String getCustName() {
        return custName;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public String getCustAddress() {
        return custAddress;
    }
    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }



}
class CustomerDAO {

    private Session session;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public int addCustomer(Customer customer)
    {
        Transaction transaction=session.beginTransaction();
        session.save(customer);
        transaction.commit();
        return customer.getCustId();

    }


}

public class MaxiMIn {
    public static void main(String[] args) {
        SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session=sf.openSession();

        CustomerDAO cd= new CustomerDAO();
        cd.setSession(session);

        BonusCard bc= new BonusCard();
        bc.setCardType("Visa");
        bc.setPoints(3500);

        Customer c= new Customer();
        c.setBonusCard(bc);
        c.setCustName("Manjunath");
        c.setCustAddress("Belgaum");

        System.out.println(cd.addCustomer(c));
        System.exit(0);
    }
}
