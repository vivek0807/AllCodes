package Junit;
import Junit.Employee;
import org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.*;

class Account{
    private int accountId;
    private String accountType;
    private int balance;

    public Account(int accountId,String accountType,int balance){
        this.accountId=accountId;
        this.accountType=accountType;
        this.balance=balance;
    }

    public void setBalance(int amt){
        this.balance = amt;
    }

    public int getBalance(){
        return balance;
    }

    public boolean deposit(int amt){
        if(amt <= 0)
            return false;
        setBalance(getBalance()+amt);
        return true;
    }

    public boolean withdraw(int amt){
        int amount = getBalance() - amt;
        if(amt <= 0 || amt > getBalance())
            return false;
        setBalance(amount);
        return true;

    }
}

public class Main {

   static Account a=null;
   static Account a1=null;
   static Account a2=null;

    @BeforeClass
    public static void setUp(){
        a=new Account(1035,"Savings",10000);


    }
    @Test
    public void testDeposit(){
        //can user assertSame assterNotSame assertEquals  assertTrue("message",val1,val2)
        assertFalse("IS true",a.deposit(-1));
        assertTrue(a.deposit(5000));

    }
    @Test
    public void testWithdraw(){
        assertFalse(a.withdraw(15000));
        assertTrue(a.withdraw(100));
    }
}
