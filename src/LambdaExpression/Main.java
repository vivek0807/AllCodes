package LambdaExpression;
import java.util.*;

@FunctionalInterface
interface DisplayText{
    public void displayTest(String text);
    public default String getInput(){
        Scanner sc=new Scanner(System.in);
        return sc.nextLine();
    }
}

public class Main {
    public static DisplayText welcomeMessage(){
        DisplayText ds=(String text)-> System.out.println("Welcome "+text);
        return ds;
    }
    public static void main(String[] args) {
       DisplayText ds=welcomeMessage();
       String text=welcomeMessage().getInput();
       ds.displayTest(text);
    }

}
