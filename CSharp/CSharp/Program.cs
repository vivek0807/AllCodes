using System;


//Implement the code here. Keep the class 'public'
 public    class Insurance
    {
        private String insuranceNo;
        private String insuranceName;
        private double amountCovered;

        public string InsuranceNo
        {
            get => insuranceNo;
            set => insuranceNo = value;
        }

        public string InsuranceName
        {
            get => insuranceName;
            set => insuranceName = value;
        }

        public double AmountCovered
        {
            get => amountCovered;
            set => amountCovered = value;
        }
    }

public class MotorInsurance : Insurance
{
    private double idv;
    private float depPercent;

    public double Idv
    {
        get => idv;
        set => idv = value;
    }

    public float DepPercent
    {
        get => depPercent;
        set => depPercent = value;
    }

    public double calculatePremium()
    {
        Idv = AmountCovered - ((AmountCovered * DepPercent) / 100);
        return 0.03 * Idv;
    }

}

public class LifeInsurance : Insurance
    {
        private int policyTerm;
        private float benefitPercent;

        public int PolicyTerm
        {
            get => policyTerm;
            set => policyTerm = value;
        }

        public float BenefitPercent
        {
            get => benefitPercent;
            set => benefitPercent = value;
        }

        public double calculatePremium()
        {
            return (AmountCovered - (AmountCovered*BenefitPercent)/100) / PolicyTerm;
        }
    }


public class Program
{
    public double addPolicy(Insurance ins, int opt)
    {
        double prem=0;
        if (opt == 1)
        {    
            LifeInsurance li = (LifeInsurance) ins;
            prem= li.calculatePremium();
        }
        else if(opt==2)
        {
            MotorInsurance mo = (MotorInsurance) ins;
            prem = mo.calculatePremium();
        }

        return prem;
    }
    
  /*  public static void Main(string[] args)
    
    {
        Program p=new Program();
        Console.WriteLine("Insurance Number:");
        String ino = Console.ReadLine();
        Console.WriteLine("Insurance Name:");
        String iname = Console.ReadLine();
        Console.WriteLine("Amount Covered:");
        double iamt = Convert.ToDouble(Console.ReadLine());
        Console.WriteLine("Select \n"

                          +"1.Life Insurance \n"
 
                          +"2.Motor Insurance:");

        int ch = Convert.ToInt32(Console.ReadLine());
        if (ch == 1)
        {
            LifeInsurance li=new LifeInsurance();
            li.InsuranceNo = ino;
            li.InsuranceName = iname;
            li.AmountCovered = iamt;
            Console.WriteLine("Policy Term");
            li.PolicyTerm = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Benefit Percent");
            li.BenefitPercent = Convert.ToSingle(Console.ReadLine());
            Console.WriteLine("Calculated Premium: "+(p.addPolicy(li,1)));

        }
        else if(ch==2)
        {
            MotorInsurance mp=new MotorInsurance();
            mp.InsuranceNo = ino;
            mp.InsuranceName = iname;
            mp.AmountCovered = iamt;
            Console.WriteLine("Depreciation Percent:");
            mp.DepPercent = Convert.ToSingle(Console.ReadLine());
            
            Console.WriteLine("Calculated Premium:"+(p.addPolicy(mp,2)));
        }
    }*/
}
