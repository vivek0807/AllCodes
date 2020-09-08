using System;
using System.Collections.Generic;

namespace CSharp.Properties
{

    public class Employee
        {
            public int id { get; set; }
            public String ename { get; set; }
            public String designation { get; set; }
            public String empType { get; set; }
    
            public Employee() { }
            public Employee(int id,String ename,String designation, String empType) {
                this.id = id;
                this.ename = ename;
                this.designation = designation;
                this.empType = empType;
            }
        }
    
    
    
    public class Delegates
    {
        public class DelegateDriver   //DO NOT change the class name
            {
               
                public Func<int, Employee> findEmployee=new Func<int, Employee>(checkList);//Complete the declaration
        
                static List<Employee> permEmpList = new List<Employee> { new Employee(101, "Kevin", "Manager", "Permanent"),
                                                                  new Employee(102, "Prestine", "IT Support", "Permanent"),
                                                                  new Employee(103, "Bishop", "Front Desk", "Permanent"),
                                                                  new Employee(104, "Nancy", "Developer", "Permanent")};
        
                static List<Employee> tempEmpList = new List<Employee> { new Employee(501, "William", "Architect", "Temporary"),
                                                                  new Employee(502, "Alan", "Tester", "Temporary"),
                                                                  new Employee(503, "Grace", "Designer", "Temporary"),
                                                                  new Employee(504, "Watson", "Designer", "Temporary")};
               
               
              /* public static void Main(string[] args)   //DO NOT change the 'Main' method signature
                {
                    //Fill code here
                    DelegateDriver dd=new DelegateDriver();

                    Employee e=dd.findEmployee(101);
                   
                }*/
        
                // Methods for Func ***
                public static Employee checkList(int id) 
                {
                    //Fill code here
                    
                    return new Employee(101, "Kevin", "Manager", "Permanent");
                    
                }

                
                }     }
}
