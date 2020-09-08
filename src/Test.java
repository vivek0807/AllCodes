abstract class Institute {



    public abstract void department();



    public void display(){

        System.out.println("NIT ");

    }

}



class College extends Institute {

    public void department() {

        System.out.print("EEE ");

    }

    public void display(){

        System.out.print("ABC College ");

    }

}



class School extends Institute {

    public void department() {

        System.out.print("English ");

    }

}



class Test {

    public static void main(String[] args) {

        Institute obj1=new College();

        obj1.department();

        obj1.display();

        Institute obj2=new School();

        obj2.department();

        obj2.display();//Line 1

    }

} 