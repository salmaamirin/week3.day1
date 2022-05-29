package week3.day1;

public class AxisBank extends BankInfo {
	double depAmt=4055.89;
	public void deposit() {
		
		System.out.println("Your Axis Bank deposit balance : " +depAmt);
	}

	public static void main(String[] args) {
		
		AxisBank obj7=new AxisBank();
		obj7.deposit();
		// TODO Auto-generated method stub

	}

}
