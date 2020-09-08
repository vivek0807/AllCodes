package LambdaExpression;

import java.util.Scanner;

@FunctionalInterface
interface NumberType {
    public boolean checkNumberType(int number);
}

public class Run {
    public static NumberType isOdd(){
        NumberType nt=(int number)->(number%2==0)?true:false;
        return nt;
    }

    public static void main(String[] args) {
        NumberType nt=isOdd();
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(nt.checkNumberType(number))
            System.out.println(number+ " is not odd");
        else
            System.out.println(number+" is odd");
    }
}
