import java.util.*;
class Account
{
	private int accNo;
	private String name;
	private double balance;
	
	public Account(int accNo,String name,double balance)
{
	this.accNo=accNo;	
	this.name=name;
	this.balance=balance;
}
	public String toString()
{
	return "\nAcc no="+accNo
	+"\nname="+name
	+"\nbalance="+balance;
}
	public void withdraw()
{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter money to withdraw");
	double amt=sc.nextDouble();
	if(amt>balance)
	System.out.println("Insufficient Amount");
else
{
	balance=balance-amt;
	System.out.println("Balnce After Withdraw"+balance);
}
}
public void deposite()
{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the amount deposite");
	double amt=sc.nextDouble();

	balance=balance+amt;
	System.out.println("Balance after Credited"+balance);
}
public double getBalance()
{
	return this.balance;
}
}
public class AccountClient
{
	public static void main (String []args)
{
	Account ac=new Account(120,"AAA",2000000);
	System.out.println(ac);
	ac.withdraw();
	ac.deposite();
System.out.println("Balance is="+ac.getBalance()); 
}
}