package Spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.Date;

@Component
class Passport{
    private int passNum;
    private Date dateOfIssue;
    private Date dateOfExpiry;

    public int getPassNum() {
        return passNum;
    }

    public void setPassNum(int passNum) {
        this.passNum = passNum;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Date getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(Date dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }
}

@Configuration
@ComponentScan //({com.package.name})Both used together
class ApplicationConfig{

}

@Component
class Employee{
    private int empId;
    private String empName;
   @Autowired
   private Passport passObj;


    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Passport getPassObj() {
        return passObj;
    }

    public void setPassObj(Passport passObj) {
        System.out.println("tring to set");
        this.passObj = getPassObj();
    }
}
public class Autowire {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Employee emp=(Employee) context.getBean("employee");
        emp.getPassObj().setPassNum(54651);
        emp.getPassObj().setDateOfIssue(new Date());
        emp.getPassObj().setDateOfExpiry(new Date());
        emp.setEmpId(5456);
        emp.setEmpName("Vivek");
        System.out.println(emp.getPassObj().getDateOfExpiry());
        System.out.println(emp.getPassObj().getDateOfIssue());
        System.out.println(emp.getPassObj().getPassNum());
        System.out.println(emp.getEmpId());
        System.out.println(emp.getEmpName());
    }
}
