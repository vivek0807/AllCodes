package LambdaExpression;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@FunctionalInterface
interface Validate{
    public boolean validateName(String name);
}

public class NameMatcher {
    public static Validate validateEmployeeName(){

        Validate ve=(String name)->{
            Pattern pat=Pattern.compile("[A-z]{5,20}");
            Matcher m=pat.matcher(name);
            return m.matches()?true:false;
        };
        return ve;
    }

    public static Validate validateProductName(){
        Validate vd=(String name)->{
            Pattern pat=Pattern.compile("[A-z]\\d{5}");
            Matcher m=pat.matcher(name);

            return m.matches()?true:false;
        };

        return vd;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        name=name.replaceAll("\\s","");
        String pname=sc.nextLine();
        Validate emp=validateEmployeeName();
        Validate prod=validateProductName();
        if(emp.validateName(name))
            System.out.println("Employee name is valid");
        else
            System.out.println("Employee name is invalid");
        if(prod.validateName(pname))
            System.out.println("Product name is valid");
        else
            System.out.println("Product name is invalid");

    }
}
