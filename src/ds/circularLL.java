package ds;
import java.util.Scanner;
class cNode{
    private int value;
    private cNode next;

    public int getValue() {
        return value;
    }

    public cNode getNext() {
        return next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(cNode next) {
        this.next = next;
    }
}
class cList{
private cNode head;
private cNode tail;
int size;
void createList(int value){

    cNode c=new cNode();
    c.setValue(value);
    head=c;
    tail=head;

    c.setNext(head);
    size++;
}

void addToFront(int value){
    cNode c=new cNode();
    c.setNext(head);
    head=c;
    size++;
    c.setValue(value);
}
void addAtLast(int value){
    cNode temp=new cNode();
    temp.setValue(value);
    temp.setNext(head);
    tail.setNext(temp);
    tail=temp;
    size+=1;

}
void insertAtAPosition(int value,int position){

    if(head==null)
        System.out.println("There is no linked list");
    else if(position>size){
        addAtLast(value);
    }
    else {
        int index=1;
        cNode tmp=new cNode();
        tmp=head;
        while ((index<position-1)){
            tmp=tmp.getNext();
            index++;
        }
        cNode newnode=new cNode();
        newnode.setValue(value);
        newnode.setNext(tmp.getNext().getNext());
        tmp.setNext(newnode);
        System.out.println("Value has been added");
        size+=1;
    }

}

void traverse(){
    int n=0;
    cNode temp=new cNode();
    temp=head;
    while (n<size){
        System.out.println("-->"+temp.getValue());
        temp=temp.getNext();
        n++;
    }

}
void checkConnection(){
    System.out.println("Last node and connected node "+tail.getValue()+"--> "+tail.getNext().getValue());
}


}

public class circularLL {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            cList cl=new cList();
            cl.createList(5);
            int ch=9;
            int value;
            while(ch!=0){
                System.out.println("Circular LIst Has been crated successfully");
                System.out.println("Enter a choice to proceed");
                System.out.println("1.Insert Node at front \n 2.Insert node at last \n 3.Insert Node at given position\n 4.insert node replacing a value");
                System.out.println("5.Traverse the list \n 6.Delete a positional node \n 7.delete entire list \n 8.delete a value");
                System.out.println("9.toExit");
                ch=sc.nextInt();
                switch (ch){
                    case 1:
                        System.out.println("Enter a node value to insert at front");
                        value=sc.nextInt();
                        cl.addToFront(value);
                        break;
                    case 2:
                        System.out.println("Enter a value to insert at last");
                        cl.addAtLast(sc.nextInt());
                        break;
                    case 3:
                        System.out.println("Enter value and position with space");
                        cl.insertAtAPosition(sc.nextInt(),sc.nextInt());
                        break;
                    case 5:
                        cl.traverse();
                        break;
                    case 10:
                        cl.checkConnection();
                        break;


                }
            }



    }
}
