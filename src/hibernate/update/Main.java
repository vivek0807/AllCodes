package hibernate.update;

import javax.persistence.Entity;// from hibernate jar file
import javax.persistence.*;// from hibernate jar file
import javax.activation.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.*;

@Entity
//@Table(name="customer_master")
class Customer{
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int customerId;
    private String customerName;
    private String emailId;
    private long phoneNo;
    public void setcustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setemailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getcustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getemailId() {
        return emailId;
    }

    public long getPhoneNo() {
        return phoneNo;
    }
}

class CustomerDAO{
    private Session session;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

   public  int createCustomer(Customer customer){ // Set Cunstomer Data
        Transaction trans=session.beginTransaction();
        session.save(customer);
        trans.commit();
        return customer.getcustomerId();
    }
   /* public List<Customer> viewCustomer(){     //View All data
        String hql="From Customer c";
        org.hibernate.Query query=session.createQuery(hql);
        List<Customer> list=query.getResultList();
        return list;
    }
    */
    public Customer  updateCustomer(int customerId, long newphoneno){  //Updates data with where condition
        Customer cobj=session.get(Customer.class,customerId);
        cobj.setPhoneNo(newphoneno);
        Transaction trans=session.beginTransaction();
        session.saveOrUpdate(cobj);
        //session.delete(cobj); to delete
        trans.commit();
        return cobj;
    }
}

public class Main {
    public static void main(String[] args) {
       SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session=sf.openSession();
        CustomerDAO cd=new CustomerDAO();
        cd.setSession(session);
        Customer cs=new Customer();
        cs.setCustomerName("Vinay");
        cs.setemailId("abc@domain.com");
        cs.setPhoneNo(858585858);
      /*System.out.println(cd.createCustomer(cs));
        List<Customer> list= cd.viewCustomer();
        for (Customer c:list) {
            System.out.println(c.getcustomerId());
            System.out.println(c.getCustomerName());
            System.out.println(c.getemailId());
            System.out.println(c.getPhoneNo());
           System.out.println(cd.updateCustomer(1,841126317).getPhoneNo());

        }
       // System.exit(0);

        System.out.println(print(1));
        for (int x=0;x<10;x++){
            x+=1;
            System.out.println("hello");
        }
    }
    static Exception print(int i){
        if(i>0)
            return new Exception();
        else
            throw new RuntimeException();*/
    }
}