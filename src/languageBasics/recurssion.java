import java.util.*;
class  recur{

    int n;

    public recur(int n) {
        this.n = n;
    }


    static  long recurr(int n){

        if(n==0)
            return 1;
        else
            return n*recurr(n-1);

    }



}

public class recurssion {


  static long recurssive(long n){ ///=static methods can be clled without making their objects
       if(n==1)
            return 1;
       else
           return n*recurssive(n-1);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(recurssive(n));
        System.out.println( "The keyboard is dead now");

        recur r= new recur(5);

        System.out.println(recur.recurr(50));
    }
}

// Learnings
/*
* static functions can be directly called without putting them in a class
* static function within a class can be called directly as className.functionName and value can be returned to main class
*recurssion is usually used in dp divide and conquer
* */