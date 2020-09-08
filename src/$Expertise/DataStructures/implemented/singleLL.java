package $Expertise.DataStructures.implemented;

import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

class node{
    private node next;
    private  int value;

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + " ";
    }
}

class single{
    private int length;
    private node head;
    private node tail;

    public void createList(int value){
        head= new node();
        head.setValue(value);
        tail=null;
        head.setNext(null);
        length=1;
        System.out.println("The list has been created");
    }

    public void traverse(){
        node current;
        if(head==null)
            System.out.println(" There is NO list");
        else
        {
            current=head;
            while (current!=null){
                System.out.println(current.getValue()+"-->");
                current=current.getNext();
            }
            System.out.println("end");
        }
    }
    public void DetectLoop(){
        node current=head;
        HashSet<node> hs=new HashSet<node>();
        boolean contains=false;
        while (current!=null){

            if (hs.contains(current))
            {
                System.out.println("The LL Contains a loop");
                contains=true;
                break;
            }
            hs.add(current);
            current=current.getNext();
        }
        if (contains==false)
            System.out.println(" There is no loop in the LL");

    }

    public void addNodeAtLast(int value){

        if(head==null)
            System.out.println("The list does not exists");
        else{node temp=new node();
            temp.setValue(value);
            temp.setNext(null);
            node current;
            current=head;
            while (current.getNext()!=null)
                current=current.getNext();
            current.setNext(temp);}
        length+=1;

    }

    public void addAtBegining(int value){
        if(head==null)
            System.out.println("There is no list");
        else{
            node temp=new node();
            temp.setValue(value);
            temp.setNext(head);
            head=temp;
            length+=1;
        }

    }
    public void addAtPosition(int position,int value){
        node current=head;
        int atPosition=1;
        if(head==null)
            System.out.println("There is no list");
        else if(position==1)
            addAtBegining(value);
        else if(position>length)
            addNodeAtLast(value);
        else{
            System.out.println("Adding at position");
            while (atPosition<position-1){
                current=current.getNext();
                atPosition+=1;
            }
            node temp=new node();
            temp.setNext(current.getNext());
            temp.setValue(value);
            current.setNext(temp);
            length++;
            System.out.println("Node has been added at position "+position);
        }
    }

    public void deleteNodeAt(int position){
        if(head==null|| length==0){
            System.out.println("There is no list");
        }
        else if(position>length){
            node cur=head;
            while (cur.getNext().getNext()!=null)
                cur=cur.getNext();
            cur.setNext(null);
            length--;
        }
        else if(position==1) {
            head = head.getNext();
            length--;
        }
        else {
            node cur=head;
            int atPosition=1;
            while (atPosition<position-1)
            {cur=cur.getNext(); atPosition++;}
            cur.setNext(cur.getNext().getNext());
            length--;
            System.out.println("Node at position "+position+" has been deleted successfully");
        }
            }

     public void findMiddlePointer(){
        node point=head;
        node fastpoint=head;
        while (fastpoint!=null && fastpoint.getNext()!=null)// VI to check both the value
        {
            fastpoint=fastpoint.getNext().getNext();
            point=point.getNext();
        }
         System.out.println("Middle of the SLL is "+point.getValue());
     }

     public void findLooplength() //use of floyd's Cycle Detection algorithm (fast pointer Technique)
     {

     }


    public int getLength() {
        return length;
    }

    public node getHead() {
        return head;
    }

    public node getTail() {
        return tail;
    }
}

public class singleLL {
    public static void main(String[] args) {
        System.out.println(" welcome to single LL program");
        Scanner sc=new Scanner(System.in);
        single sl=new single();
        int ch;
        int value;
        while (true){
            try {
                System.out.println("1.Create New");
                System.out.println("2.Add at last");
                System.out.println("3.Traverse");
                System.out.println("4.Add at Position");
                System.out.println("5.Get size");
                System.out.println("6.Delete at a given position");
                System.out.println("7.Find Middle(using fast Pointer)");
                System.out.println("8.Find out loop(Using hash method)");
                System.out.println("0.Exit");
                ch=sc.nextInt();
                sc.nextLine();
                switch (ch){
                    case 1:
                        System.out.println("Enter a node value");
                        value=sc.nextInt();
                        sl.createList(value);
                        break;
                    case 2:
                        System.out.println("Enter a value to add at last");
                        sl.addNodeAtLast(sc.nextInt());
                        break;
                    case 3:
                        sl.traverse();
                        break;
                    case 4:
                        System.out.println("Enter position to add");
                        int position=sc.nextInt();
                        System.out.println("Provide value to put");
                         value=sc.nextInt();
                        sl.addAtPosition(position,value);
                        break;
                    case 5:
                        System.out.println("The size is- "+sl.getLength());
                        break;
                    case 6:
                        System.out.println("Provide the position for node deletion");
                        sl.deleteNodeAt(sc.nextInt());
                        break;
                    case 7:
                        sl.findMiddlePointer();
                        break;
                    case 8:
                        sl.DetectLoop();
                        break;
                    case 0:
                        System.exit(0);
                        break;

                }

            }
            catch (InputMismatchException e)
            {System.out.println(e);
            sc.nextLine();
            }

        }
    }
}
