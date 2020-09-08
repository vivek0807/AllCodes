package languageBasics;
import java.util.Scanner;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Currency;
import java.text.NumberFormat;
public class currencyForamtter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double currency=sc.nextDouble();
        BigDecimal bd=new BigDecimal(currency);
        bd=bd.setScale(2,BigDecimal.ROUND_HALF_UP);
        currency=bd.doubleValue();

       Locale india=new Locale("en","IN");
       NumberFormat in=NumberFormat.getInstance(india);
       NumberFormat us=NumberFormat.getInstance(Locale.US);
       NumberFormat china=NumberFormat.getInstance(Locale.CHINA);
       NumberFormat france=NumberFormat.getInstance(Locale.FRANCE);
        String s=us.format(currency);
        System.out.println(s);
        try{
        if(s.charAt(s.length()-3)=='.') {
            System.out.println("US: $" + s);
            System.out.println("India: Rs." + in.format(currency));
            System.out.println("China: ￥" + china.format(currency));
            System.out.println("France: " + france.format(currency) + " €");
        }else {
                System.out.println("US: $" + s+".00");
                System.out.println("India: Rs." + in.format(currency)+".00");
                System.out.println("China: ￥"+china.format(currency)+".00");
                System.out.println("France: " + france.format(currency)+",00 €");
            }

        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("US: $" + s+".00");
            System.out.println("India: Rs." + in.format(currency)+".00");
            System.out.println("China: ￥"+china.format(currency)+".00");
            System.out.println("France: " + france.format(currency)+",00 €");
        }}


    }
