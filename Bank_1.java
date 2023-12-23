import java.util.*;
class BankAccount 
  {
    private int balance;
  
    BankAccount(int balance)
     {
      this.balance=balance;
     }

    public void deposit(int Damount)
     {
       balance+=Damount;
     }
    public void withdraw(int Wamount)
     {
       if(balance>=Wamount)
         {
  	   balance-=Wamount;
           System.out.println("Withdraw SuccessFull");
         }
	else
         {
	        System.out.println("Insufficient Balance !!!");
         }
     }
   public int getBalance()
     {
      return balance;
     }
 }

class SavingsAccount extends BankAccount
  {
    SavingsAccount(int balance)
      {
       super(balance);
      }
    public void withdraw(int Wamount)
     {
       if((getBalance()-Wamount)<100)
         {
	  System.out.println("Maintained Balance Required 100 !!!");
         }
	else
         {
	  super.withdraw(Wamount);
         }
     }
  } 
public class Bank_1
  {
   public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int amount,ch;
      BankAccount bnk=new BankAccount(1000);
      SavingsAccount sbnk=new SavingsAccount(1000);
  while(true) {
      System.out.printf("\n1> WITHDRAW\t2> DEPOSIT\t3> SB\t4> EXIT\n --->>");
      ch=sc.nextInt();
      if(ch==1)
       {
        System.out.printf("\nEnter Amount : ");
       amount=sc.nextInt();
        bnk.withdraw(amount);
       }
    else if(ch==2)
       {
        System.out.printf("\nEnter Amount : ");
        amount=sc.nextInt();
        bnk.deposit(amount);
       }
    else if(ch==3)
       {
        System.out.printf("\nEnter Amount : ");
        amount=sc.nextInt();
        sbnk.withdraw(amount);
       }
     else if(ch==4)
       {
        System.exit(0);
       }
     else
       {
        System.out.printf("\n : Give Correct Input :");
       }
    }
  }
}