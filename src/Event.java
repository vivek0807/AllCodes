import java.util.*;
public class Event{
    public static void main(String[] args) {
        System.out.println("Enter the number of testcases");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        String names[]=new String[t];
        String grade[]=new String[t];
        for (int i = 0; i <t ; i++) {
            String arr[]= new String[6];
            System.out.println("Enter Values separated with :");
            String input=sc.nextLine();
            arr=input.split(":");

            names[i]=arr[0];
            int sum=0;
            for (int j = 1; j <6 ; j++) {
                sum=sum+Integer.parseInt(arr[j]);
            }
            if(sum<=500 &&sum>=401)
                grade[i]="A";
            else if(sum<=400 &&sum>=301)
                grade[i]="B";

        }
        for (int i = 0; i <t ; i++) {
            System.out.println(names[i]+":"+grade[i]);
        }
    }
}