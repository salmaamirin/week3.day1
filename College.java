/* Assignment2:
=============
     Package   :org.college
     Class     :College
     Methods   :collegeName(),collegeCode(),collegeRank()

     Package   :org.department
     Class        :Department
     Methods   :deptName()
 
     Package   :org.student
     Class        :Student
     Methods   :studentName(),studentDept(),studentId()
  
Description:
create above 3 class and call all your class methods into the Student using multilevel inheritance.   */

package week3.day1;

public class College {
	String Name="ABC";
	String Code="15UC12";
	String Rank="A";

	public void collegeName() {
		System.out.println("College Name : " +Name);
	}
	public void collegeCode() {
		System.out.println("College code : " +Code);
	}
	public void collegeRank() {
		System.out.println("College Rank : " +Rank);
	}

	public static void main(String[] args) {

		College obj3=new College();
		obj3.collegeName();
		obj3.collegeCode();;
		obj3.collegeRank();


		// TODO Auto-generated method stub

	}

}
