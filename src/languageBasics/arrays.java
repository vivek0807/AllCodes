package languageBasics;
import java.util.Scanner;
class singleDarray{
    int arr[]=null;

    singleDarray(int size){
        arr=new int[size];
        /*for (int i = 0; i <size ; i++) {
            arr[i]=Integer.MIN_VALUE;

        }*/
        System.out.println(Integer.MIN_VALUE);
    }

    public void traverse(){
        try{
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }}
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void insertVal(int value,int position){
        try{
            if(arr[position]==Integer.MIN_VALUE) {
                arr[position] = value;
                System.out.println("Value insterted at "+position+" "+value);
            }else {
                System.out.println("Ther is alrady a value inserted");
            }

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e +" Invalid index entry");
        }

    }

    public void getElement(int position){
        try{
            System.out.println("Value at position is "+arr[position]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println( e + "You have given a wrong index entry");
        }
    }

    public void deleteElement(int position){
        try{
            System.out.println(" Removing element "+arr[position]);
            arr[position]=Integer.MIN_VALUE;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e+"The index was out of bound");
        }

    }
    public void deleteArray(){
        arr=null;
        System.out.println("The array has been deleted succesfully");

    }


}

public class arrays {
    public static void main(String[] args) {
        singleDarray sd=new singleDarray(10);
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        while (Character.isDigit(ch)){
            int n=Character.getNumericValue(ch);
            switch (n){
                case 1:
                    sd.insertVal(52,0);
                    System.out.println("Insterting value done");
                    break;
                case 2:
                    sd.deleteElement(2);
                    System.out.println("Deleted Element a position 2");
                    break;
                case 3:
                    sd.getElement(5);
                    break;
                default:
                    System.exit(0);

            }
            System.out.println("Enter next value");
            ch=sc.next().charAt(0);
        }


    }
}
