package week3.day1;

public class Department extends College {
	String dept="CSE";
	
	public void deptName() {
		System.out.println("Department : " +dept);
	}
	
	

	public static void main(String[] args) {
		
		Department obj4=new Department();
		obj4.collegeName();
		obj4.collegeCode();
		obj4.collegeRank();
		obj4.deptName();
		// TODO Auto-generated method stub

	}

}
