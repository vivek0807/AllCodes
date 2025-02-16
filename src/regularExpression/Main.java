package regularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Pattern pat=Pattern.compile("((?=.*[a-z])(?=.*[A-Z])(?=.*[@#%]).{8,})");
        Scanner sc=new Scanner(System.in);
        System.out.println("Generate your Security Code ");
        Matcher m=pat.matcher(sc.nextLine());
        if(m.matches())
            System.out.println("Security Code Generated Successfully");
        else
            System.out.println("Invalid Security Code, Try Again!");
    }
}
