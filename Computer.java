/*Assignment1:
===========
     Package   :org.system
     Class        :Computer
     Methods   :computerModel()

     Class        :Desktop
     Methods   :desktopSize()

Description:
create above 2 class and call all your class methods into the Desktop using single inheritance.*/

package week3.day1;

public class Computer {
	String model="Dell";
	public void computerModel() {
		System.out.println("Computer model : " +model);
		
	}

	public static void main(String[] args) {
		Computer obj1=new Computer();
		obj1.computerModel();
		
		
		// TODO Auto-generated method stub

	}

}
