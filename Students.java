package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
	System.out.println("id : " +id);
	}
	
	public void getStuentInfo(int id,String Name) {
		System.out.println("id : " +id);
		System.out.println("Name :" +Name);
	}
	public void getStudentInfo(String email,long phno) {
		System.out.println("Email : " +email);
		System.out.println("ph number : " +phno);
	}
	public static void main(String[] args) {
		
		Students stu=new Students();
		stu.getStudentInfo(1500);
		stu.getStuentInfo(1500,"Salma");
		stu.getStudentInfo("xyz@gmail.com", 9988787865L);
		// TODO Auto-generated method stub

	}

}
