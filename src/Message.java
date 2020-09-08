 class Message {
    String msg;

    int noOfWords;

    public Message() {

        msg += " Thank you";

    }

    public Message(int noOfWords)               {

        this.noOfWords = noOfWords;

        msg = "Welcome";

      //  Message();

    }

    public static void main(String args[])    {

        Message m = new Message(5);

        System.out.println(m.msg);
        Integer x1 = new Integer(120);

        int x2 = 120;

        System.out.println( x1 == x2 );



    }
}
