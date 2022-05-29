package week3.day1;

public class Desktop extends Computer{
	double size=13.3;
	
	public void desktopSize() {
		System.out.println("Desktop size : " +size);
	}

	public static void main(String[] args) {
		Desktop obj2=new Desktop();
		obj2.computerModel();
		obj2.desktopSize();
		// TODO Auto-generated method stub

	}

}
