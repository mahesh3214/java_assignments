package javaassignments;

public class CurrentAccount extends bank {

		private double cashcredit;
		private double balance;
		
	 public CurrentAccount(double cashcredit, double balance)
	 {
		 this.balance=balance;
		 this.cashcredit=cashcredit;
		 
	 }
	 public double totalAmt() {

	     double currentbal= cashcredit+balance;
	     return currentbal;
	      }
	}

