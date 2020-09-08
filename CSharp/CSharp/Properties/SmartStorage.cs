using System;

namespace CSharp.Properties
{
    //used to call a similar signature function
  public class Publisher
    {
        public delegate void BeforeMessage(string msg);

        public event BeforeMessage beforeMessageEvent;

        public void newMessage()
        {
            if(beforeMessageEvent!=null)
                Console.WriteLine("Today is a hot day");
        }

    }

public   class Subscriber1
    {
        private Publisher publisher;

        public Subscriber1(Publisher publisher)
        {
            this.publisher = publisher;
            publisher.beforeMessageEvent += beforeMessageEventHandler;
        }

          public  void beforeMessageEventHandler(String msg)
        {
            Console.WriteLine("msg");
        }
    }

 public   class Subscriber2
    {
        private Publisher publisher;

        public Subscriber2(Publisher publisher)
        {
            this.publisher = publisher;
            publisher.beforeMessageEvent += beforeMessageEventHandler;
        }
        
       public void beforeMessageEventHandler(String msg)
       {
           Console.WriteLine(msg);
       }
        
    }
    
    
    
    
    
   public class DelegateDriver{
        
       
     /*  static void Main(string[] args)
        {
            Publisher ps= new Publisher();
            
            Subscriber1 s1= new Subscriber1(ps);
            Subscriber2 s2= new Subscriber2(ps);

           

        }*/

         
    }
}