package LambdaExpression;
import java.util.*;

@FunctionalInterface
interface Calculate{
    float performCalculation(int a,int b);

}

interface ITest{

    public float calculate(int a,int b);

}
public class Calculator {
    static Calculate calculate;
    public static Calculate  performAddition(){
        calculate=(int a,int b)->a+b;
        return calculate;
    }
    public static Calculate  performSubtraction(){
        calculate=(int a,int b)->a-b;
        return calculate;
    }
    public static Calculate  performProduct(){
        calculate=(int a,int b)->a*b;
        return calculate;
    }
    public static Calculate  performDivision(){
        calculate=(int a,int b)->((float) a/(float) b);
        return calculate;
    }

    public static void main(String[] args) {
      /*  Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

       /* System.out.println("The sum is "+performAddition().performCalculation(a,b));
        System.out.println("The difference is "+performSubtraction().performCalculation(a,b));
        System.out.println("The product is "+performProduct().performCalculation(a,b));
        System.out.println("The division value is "+performDivision().performCalculation(a,b));*/

        ITest test=(int a,int b)->{return a+b;};

        System.out.println(test.calculate(5, 4));


    }
}
