package week3.day1;

public class Student extends Department{
	String stuName="Salma";
	String studept="CSE";
	int idno=1890;
	
	public void studentName() {
		System.out.println("Student Name : " +stuName);
		
	}
	public void studentDept() {
		System.out.println("Student Department : " +studept);
		
	}
	
	public void studentId() {
		System.out.println("Student ID : " +idno);
		
	}

	public static void main(String[] args) {
		Student obj5=new Student();
		obj5.collegeName();
		obj5.collegeCode();
		obj5.collegeRank();
		obj5.deptName();
		obj5.studentName();
		obj5.studentDept();
		obj5.studentId();
		
		// TODO Auto-generated method stub

	}

}
