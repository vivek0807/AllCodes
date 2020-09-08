import java.util.*;

public class WrappedString {

  private String s;

   public WrappedString(String s) { this.s = s; }

    public static void main(String[] args) {
        Set set=new TreeSet();


        set.add(9);

        set.add(8);

        Iterator it=set.iterator();

        while(it.hasNext())

            System.out.print(it.next()+" ");

   } }