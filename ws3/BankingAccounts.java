import java.util.*;

class Account
{
    double balance;
    Account(double balance)
    {
       this.balance = balance;
    }
    public void deposit(double amount)
    {
        balance+=amount;
    }
    public void withdraw(double amount)
    {
        if(amount>balance)
        {
            System.out.println("Insufficient Funds");
            return;
        }
        balance-=amount;
    }
}

class SavingsAccount extends Account
{
     static double defaultinitialRate = 2.5;
     double interestRate;
     SavingsAccount(double balance)
     {
         super(balance);
         interestRate = defaultinitialRate;
     }
     public static void setDefaultinitialRate(double  interestRate)
     {
         defaultinitialRate = interestRate;
     }
     public void applyMonthlyInterest()
     {
         balance+=(balance/interestRate);
     }
}

public class BankingAccounts {

    public static void main(String[]args)
    {
        Account myAccount = new Account(980.56);
    }
}