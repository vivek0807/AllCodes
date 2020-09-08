import java.util.Scanner;

class dblenode{
    int value;
    dblenode next;
    dblenode previous;

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(dblenode next) {
        this.next = next;
    }

    public void setPrevious(dblenode previous) {
        this.previous = previous;
    }

    public int getValue() {
        return value;
    }

    public dblenode getNext() {
        return next;
    }

    public dblenode getPrevious() {
        return previous;
    }
}

class dblelist{
    int size=0;
    dblenode head;
    dblenode tail;
    void createList(int value){
           dblenode dl=new dblenode();
            head=dl;
            dl.setValue(value);
            dl.setPrevious(null);
            dl.setNext(null);
            tail=dl;
    }
    void addAtFront(int value){
        dblenode node=new dblenode();
        head.setPrevious(node);
        node.setNext(head);
        node.setPrevious(null);
        node.setValue(value);
        head=node;
        size+=1;

    }
    void addAtLast(int value){
        dblenode node=new dblenode();
        node.setValue(value);
        node.setPrevious(tail);
        node.setNext(null);
        tail.setNext(node);
        tail=node;
        size++;
    }
    void traverseFront(){
        int index=0;
        dblenode temp=new dblenode();
        temp=head;
        while (index<size){
            System.out.print(temp.getValue()+"-->");
            temp=temp.getNext();
        }
    }

    void traverseReverse(){
        int index=0;
        dblenode temp=new dblenode();
        temp=tail;
        while (index<size){
            System.out.println(temp.getValue()+"<--");
            temp=temp.getPrevious();
            size++;
        }

    }

}

public class doubleLL {
    public static void main(String[] args) {

        dblelist dlw=new dblelist();
        dlw.createList(5);
        int choice=Integer.MAX_VALUE;
        Scanner sc=new Scanner(System.in);
        while (choice!=0){
            System.out.println("1.Add at front \n2.Add at last \n3.Traversefront \n 4.traverse reverse ");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter at front");
                    dlw.addAtFront(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter at last");
                    dlw.addAtLast(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Reversing linear");
                    dlw.traverseFront();
                    break;
                case 4:
                    System.out.println("Traversing reverse");
                    dlw.traverseReverse();
                    break;

            }

        }

    }
}
