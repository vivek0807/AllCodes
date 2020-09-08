using System;
using System.IO;
using System.Xml.Serialization;

namespace CSharp
{
    public class GenericDelegates
    {
        public static Action<string> search=findByEmail+findByLastName;
        
        
    static String[] lastName = { "Thomas", "Moody", "Joe", "Kapoor", "Shirley" };
    static String[] mail = { "tmail@hotmail.com","moody1209@yahoo.com","sam12@hotmail.com","priv54@gmail.com","Tracy123@live.com"};
     
        String result;
        public static void Main(string[] args)    //DO NOT change the 'Main' method signature
        {
            //Implement your code here
            
            GenericDelegates ac= new GenericDelegates();
            string ch;
            Console.WriteLine("1. Search By Name");
            Console.WriteLine("2. Search By Mail Id");
            Console.WriteLine("Enter Option :");
            ch = Console.ReadLine();
            string response;
            Console.WriteLine("Enter Name or Mail Id \nEnter Input :");
            response = Console.ReadLine();
            ac.searchPerson(ch,response);
            
            


        }
     
        //Implement Handler method
        public static void findByLastName(string name)
        
        {
            foreach (var VARIABLE in lastName)
            {
                if(VARIABLE.Equals(name))
                    Console.WriteLine(name+" Found.");
            }
            
        }

        public static void findByEmail(String email)
        {
            foreach (var VARIABLE in mail)
            {
                if(VARIABLE.Equals(email))
                    Console.WriteLine(email+" Found.");
            }
        }
     
        //Implement searchPerson method

        public  void searchPerson(String input, String response)
        {
            if (input.Equals("1"))
            {
                search += findByLastName;
                search(response);
            }
            if (input.Equals("2"))
                search(response);

        }
        
    }
}