package week3.day1;

public class AndroidPhone extends Mobile{
	
	public void takeVideo() {
		System.out.println("** Video has been saved successfully**-this is from AndroidPhone class");
		
	}

	public static void main(String[] args) {
		AndroidPhone android=new AndroidPhone();
		android.takeVideo();
		android.sendMsg();
		android.makeCall();
		android.saveContact();
		// TODO Auto-generated method stub

	}

}
