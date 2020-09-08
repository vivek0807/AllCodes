package $Expertise.Language;
import javafx.beans.binding.ObjectExpression;

import java.util.*;


import java.util.*;
public class Main{

    static Iterator func(ArrayList mylist){
        Iterator it=mylist.iterator();
        while(it.hasNext()){
        Object element = it.next();
                   if(element instanceof String)//Hints: use instanceof operator

            break;
        }
        return it;

    }
    @SuppressWarnings({ "unchecked" })
    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        mylist.add(45);
        mylist.add(45);
        mylist.add(45);

        mylist.add("###");
        mylist.add("Hello");
        mylist.add("World");

        Iterator it=func(mylist);
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

