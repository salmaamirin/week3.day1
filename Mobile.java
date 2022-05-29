package week3.day1;

/*Create 3 Classes:
- Mobile (methods - sendMsg, makeCall, saveContact), AndroidPhone (takeVideo), 
SmartPhone (connectWhatsApp)
- AndroidPhone extends Mobile and SmartPhone extends AndroidPhone
- Create Object for SmartPhone and execute all methods*/

public class Mobile {
	public void sendMsg() {
		System.out.println("Message has been sent-this is from Mobile class");
	}
	
	public void makeCall() {
		System.out.println("You can make calls anytime-this is from Mobile class");
	}
	
public void saveContact() {
		System.out.println("Contact has saved sucessfully-this is from Mobile class");
	}

	public static void main(String[] args) {
		Mobile mobileobj=new Mobile();
		mobileobj.sendMsg();
		mobileobj.makeCall();
		mobileobj.saveContact();
		
		
		
	}
		// TODO Auto-generated method stub

}
