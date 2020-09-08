import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
class Customer{
    private int custId;
    private String custName;
    private String emailId;
    private long contactNo;

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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }
}


class  MemberShip{
   private int membershipId;
   private String membershipType;
   private int visitsPerYear;
   private Customer customer;

   public MemberShip(Customer customer) {
        this.customer = customer;
    }

    public int getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public int getVisitsPerYear() {
        return visitsPerYear;
    }

    public void setVisitsPerYear(int visitsPerYear) {
        this.visitsPerYear = visitsPerYear;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}


public class Injection {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        MemberShip ms=(MemberShip) context.getBean("memberShip"); //reads from XML

        ms.setMembershipId(123);
        ms.setMembershipType("Permamnent");
        ms.setVisitsPerYear(100);
        ms.getCustomer().setContactNo(741126317);
        ms.getCustomer().setCustName("Vivek");
        ms.getCustomer().setCustId(123);
        ms.getCustomer().setEmailId("asddsad");
        System.out.println(ms.getCustomer().getCustId());
        System.out.println(ms.getCustomer().getCustName());
        System.out.println(ms.getCustomer().getContactNo());
        System.out.println(ms.getMembershipId());
        System.out.println(ms.getMembershipType());
        System.out.println(ms.getVisitsPerYear());
    }
}
