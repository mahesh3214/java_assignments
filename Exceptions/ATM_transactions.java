package javaassignments;
import java.util.Scanner;
public class ATM_transactions {
	double balance= 50000.00;
	 long id=123456;
	double deposite,amount;
	public void savingsaccount()  {
		System.out.println("account Id "+id);
		 System.out.println("Choose 1 for Withdraw");
         System.out.println("Choose 2 for Deposite");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
{
try {
if(n==1){
System.out.println("enter withdraw amount");
amount=sc.nextDouble();
withdraw();
}
if(n==2) {
	System.out.println("enter deposite amount");
	amount=sc.nextDouble();
	deposite=balance+amount;
	System.out.println("Total amount "+deposite);
}
}
catch(InsufficientBalanceException e) {
	System.out.println(e);}
catch(IllegalBankTransactionException e) {
	System.out.println(e);
}
}
	}
	
 public void withdraw() throws InsufficientBalanceException,IllegalBankTransactionException
{

	if(amount>balance)
	{
    throw new InsufficientBalanceException("insufficient balance enter less amount");
 }else{balance = balance-amount;
 if(amount<0) {
	 throw new IllegalBankTransactionException("enter valid amount");
 }
 System.out.println("current balance "+balance);}}
	
	
	
	public static void main(String args[])
{

ATM_transactions at=new ATM_transactions();
at.savingsaccount();
}
	}