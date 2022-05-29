/* Assignment3:
============
    Class     :BankInfo
    Methods :saving(),fixed(),deposit()

     Class     :AxisBank
     Methods :deposit()

Description:
You have to override the method deposit in AxisBank.*/

package week3.day1;

public class BankInfo {
	double savAmt=15000.45;
	double fixAmt=6700.56;
	double depAmt=3000.50;
	
	public void saving() {
		System.out.println("Your Savings Account balance : " +savAmt);
	}
	public void fixed() {
		System.out.println("Your Fixed Account balance : " +fixAmt);
	}
	public void deposit() {
		System.out.println("Your Deposit Account balance : " +depAmt);
	}

	public static void main(String[] args) {
		
		BankInfo obj6=new BankInfo();
		obj6.saving();
		obj6.fixed();
		obj6.deposit();
		// TODO Auto-generated method stub

	}

}
