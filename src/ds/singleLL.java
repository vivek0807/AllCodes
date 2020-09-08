import java.util.Scanner;
class node{
    private int value;
    private node next;

    public int getValue() {
        return value;
    }

    public node getNext() {
        return next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(node next) {
        this.next = next;
    }
}

class singleLList{

    node head;
    node tail;
    static int size=0;
    void createList(int value){
        node n=new node();
        head=n;
        head.setNext(null);
        head.setValue(value);
        tail=head;
        size++;

    }
    ///////////////insertion
    void insertAtFront(int value){
        node n=new node();
        n.setNext(head);
        head=n;
        n.setValue(value);
        size++;

    }

    void insertAtBack(int value){
        node temp=new node();
        temp.setValue(value);
        temp.setNext(null);
        tail.setNext(temp);
        tail=temp;
        size++;
    }
    void insertAtposition(int position,int value){
        if(position>size-1){
            System.out.println("Insertion will be made at last");
            insertAtBack(value);
        }
        else if(position<1 || head ==null){
            System.out.println("Please give a correct input or linked list does no exist");
        }
        else if(position==1){
            insertAtFront(value);
        }
        else if(position<size-1 && position>1){
            int index=0;
            node temp=new node();
            temp=head;
            while (index!=position-2){
                index++;
                temp=temp.getNext();
            }
            node n=new node();
            n.setValue(value);
            n.setNext(temp.getNext().getNext());
            temp.setNext(n);
            System.out.println("Insertion Done");
            size++;

        }

    }

    void traverse(){
        if(size==0 || head==null)
        {
            System.out.println("There is no linked list");
        }
        else {
            node temp=new node();
            temp=head;
            System.out.println("");
            while (temp!=null){
                System.out.print(temp.getValue()+"-->");
                temp=temp.getNext();
            }
        }

    }


}
public class singleLL{

    public static void main(String[] args) {
        singleLList sll=new singleLList();
        sll.createList(5);
        Scanner sc=new Scanner(System.in);
        Byte c=-1;
        while (c!=0){
            System.out.println("===========================\nOperations :");
            System.out.println("1.insert at front");
            System.out.println("2.insert at last");
            System.out.println("3.insert at position");
            System.out.println("4.view size");
            System.out.println("5. delete by value ");
            System.out.println("6.delete by position");
            System.out.println("7.delete entire list");
            System.out.println("8.Traverse entire list");
            c=sc.nextByte();
            switch (c){
                case 1:
                    System.out.println("enter a value to insert at front");
                    sll.insertAtFront(sc.nextByte());
                    break;
                case 2:
                    System.out.println("enter a value to insert at last");
                    sll.insertAtBack(sc.nextByte());
                    break;
                case 3:
                    System.out.println("Enter a  position and value respectively");
                    sll.insertAtposition(sc.nextByte(),sc.nextByte());
                    break;
                case 4:
                    System.out.println(sll.size);
                    break;
                case 8:
                    System.out.println("Traversing");
                    sll.traverse();
                    break;

            }

        }


    }

}