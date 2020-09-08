import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Date;

//@Component
class DebitCard{
    private int cardNo;
    private String cardHolderName;
    @Value("platinum")
    private String cardType;
    private Date fromDate;
    private Date expiryDate;

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}

/*@Configuration
@ComponentScan
//({com.package.name})Both used together
class ApplicationConfig{

}*/

/*public class Driver {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(DebitCard.class);
        DebitCard dc=(DebitCard)context.getBean("debitCard");
        dc.setCardHolderName("Vivek");
        dc.setCardNo(348946515);
        dc.setFromDate(new Date());
        dc.setExpiryDate(new Date());
        System.out.println(dc.getCardType());
        System.out.println(dc.getFromDate());
        System.out.println(dc.getExpiryDate());
        System.out.println(dc.getCardNo());
        System.out.println(dc.getCardHolderName());
    }
}*/
