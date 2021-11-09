package javaassignments;

	public class SavingAccount extends bank{
	    private double fixedDeposit;
	    private double balance;
	    

	    public SavingAccount(double fixedDeposit, double balance)
	    {
	    	this.fixedDeposit=fixedDeposit;
	    	this.balance=balance;
	    }
	    public double totalAmt() {
	    	double Savingsbal= fixedDeposit+balance;
	    	return Savingsbal;
	   }
}
