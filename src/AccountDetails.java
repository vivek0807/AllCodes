import jdk.dynalink.beans.StaticClass;

import java.util.Iterator;
import java.util.Scanner;
import java.util.*;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*class Student{
    private int id;
    private String name;
    int[] marks;
    float average;
    char grade;

    public Student(int id, String name, int[] marks, float average, char grade) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.average = average;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    public float getAverage() {
        return average;
    }

    public char getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void calculateAvg(){
        float avg=0;
        for (int i = 0; i <getMarks().length ; i++) {
            avg+=getMarks()[i];
        }
        setAverage(avg/(getMarks().length));
    }

   public void  findGrade(){
        boolean settled=false;
       for (int i = 0; i <getMarks().length ; i++) {
           if(getMarks()[i]<50)
           {
               setGrade('F');
               settled=true;
           }
       }

       if(settled==false)
       {
           float avg=getAverage();
           if(avg>=80 && avg<=100)
               setGrade('O');
           else
               setGrade('A');
       }
   }
}



public class AccountDetails{
    static Scanner sc=new Scanner(System.in);
    public static Student getStudentDetails(){

        System.out.println("Enter the id:");
       int id= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name:");
        String name= sc.nextLine();
        int n=-1;
        while (n<=0)
        {System.out.println("Enter the no of subjects:");
        n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid number of subject");
        }
        int[] arr= new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("Enter mark for subject "+(i+1)+":");
            arr[i]=sc.nextInt();
            if(arr[i]<0){
                System.out.println("Invalid Mark");
                i--;
            }
        }

        Student s=new Student(id,name,arr,0,'F');
        return s;
    }

    public static void main(String[] args) {
      /*  Student s=getStudentDetails();
        s.calculateAvg();
        s.findGrade();
        System.out.println("Id:"+s.getId());
        System.out.println("Name"+s.getName());
        System.out.printf("Average:%.2f",s.getAverage());
        System.out.println("\nGrade:"+s.getGrade());


        Map<String,String> map=new HashMap();

        map.put("tina","Devpt");

        map.put(null,"Test");

        map.put(null,"Admin");

        System.out.println(map);

    }
}*/