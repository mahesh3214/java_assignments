package javaassignments;

public class bank {

	public static void main(String[] args) {
   SavingAccount savingaccount = new SavingAccount(10000,600);
   CurrentAccount currentaccount = new CurrentAccount(1000,300);
   savingaccount.totalAmt();
   currentaccount.totalAmt();
   double totalbankbal= savingaccount.totalAmt()+currentaccount.totalAmt();
   System.out.println("total cash in the bank:"+totalbankbal);
   }

}
