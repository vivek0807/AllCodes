package languageBasics;

import java.io.*;
import java.util.Scanner;

public class staticInitializer {
    static  Scanner sc=new Scanner(System.in);
    static int B=sc.nextInt();
    static int H=sc.nextInt();
    static boolean flag=true;
  static {
      if(B<=0|| H<=0)
      {  flag=false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");}
  }
    public static void main(String[] args)throws IOException {

        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
