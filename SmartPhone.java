package week3.day1;

public class SmartPhone extends AndroidPhone{
	public void connectWhatsApp() {
		System.out.println("<Your Whats app number is connected successfully>");
	}
	
	public void takeVideo() {
		System.out.println("** Video has been taken successfully**-this is from AndroidPhone class");
		
	}


	public static void main(String[] args) {
		SmartPhone smartobj=new SmartPhone();
		smartobj.connectWhatsApp();
		smartobj.takeVideo();
		smartobj.saveContact();
		smartobj.sendMsg();
		smartobj.makeCall();
		
		
		// TODO Auto-generated method stub

	}

}
