package regularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class namsespace {
    public static void main(String[] args) {
        Pattern name=Pattern.compile("^[a-zA-Z \\s]*$");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name");
        String nam=sc.nextLine();
        System.out.println("Enter the email Id");
        String email=sc.nextLine();
        Matcher m=name.matcher(nam);
        if(!m.matches())
            System.out.println("Invalid name");
        else {
            while (!email.endsWith("@gmail.com"))
            {System.out.println("Invalid email Id. Try again");
                email=sc.nextLine();}
            System.out.println("Your registration is successful");
        }
    }
}
