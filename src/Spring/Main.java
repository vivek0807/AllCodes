package Spring;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.nio.file.attribute.DosFileAttributes;

class Address{

    private String street;
    private String city;
    private String pincode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}

class Cutomer{
    private int custid;
    private Address address;

    public Cutomer(Address address) {
        this.address = address;
    }

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
/////////////////////////////////////////////////////////////

/*@Configuration
@ComponentScan//({com.package.name})Both used together
class ApplicationConfig{

}*/


class FixedDeposit{
private int accountNumber;
private String accntHolderName;
private float amt;
private int tenure;
//@Value("10.0")
private float intrestRate;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccntHolderName() {
        return accntHolderName;
    }

    public void setAccntHolderName(String accntHolderName) {
        this.accntHolderName = accntHolderName;
    }

    public float getAmt() {
        return amt;
    }

    public void setAmt(float amt) {
        this.amt = amt;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public float getIntrestRate() {
        return intrestRate;
    }

    public void setIntrestRate(float intrestRate) {
        this.intrestRate = intrestRate;
    }
}

class Doctor{
    private int paitents;

    public int getPaitents() {
        return paitents;
    }

    public void setPaitents(int paitents) {
        this.paitents = paitents;
    }
}
/////////////////////////////
public class Main {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
      FixedDeposit fd=(FixedDeposit) context.getBean("FixedDeposit"); // reads from XML
       // MemberShip ms=(MemberShip) context.getBean("MemberShip"); // reads from XML
        //Doctor doc=(Doctor) context.getBean("Doctor"); // reads from XML
       // Address addres=(Address)context.getBean("addrObj");
      //  ApplicationContext context=new AnnotationConfigApplicationContext(FixedDeposit.class);
       // FixedDeposit fd=(FixedDeposit)context.getBean("fixedDeposit");

       fd.setAccountNumber(31152656);
       fd.setAccntHolderName("Vivek");
       fd.setAmt(500000);
       fd.setTenure(3);
        System.out.println(fd.getAccntHolderName());
        System.out.println(fd.getAccountNumber());
        System.out.println(fd.getAmt());
        System.out.println(fd.getTenure());
        System.out.println(fd.getIntrestRate());

    }
}
