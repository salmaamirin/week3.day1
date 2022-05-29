package week3.day1;
/*Classroom2:
Create class Calculator with below methods:
- 2 methods for add(). 1 method will 2 int arguments, 1 method with 3 int args
- 2 methods for sub(). 1 method will 2 int arguments, 1 method with 2 double arg
- 2 methods for mul(). 1 method will 2 int arguments, 1 method with 1 double and 1 int arg
Create the same method (takeVideo) in SmartPhone class and execute it*/

public class Calculator {
	public void add(int a,int b) {
		System.out.println("Add method 1:");
		System.out.println(a+b);
	}
	public void add(int a,int b,int c) {
		System.out.println("Add method 2:");
		System.out.println(a+b+c);
		
	}
	
	public void sub(int a,int b) {
		System.out.println("Sub method 1:");
		System.out.println(a-b);
		
	}
	public void sub(double a,double b) {
		System.out.println("Sub method 2:");
		System.out.println(a-b);
	}
	public void mul(int a,int b) {
		System.out.println("Mul method 1:");
		System.out.println(a*b);
	}
	public void mul(double a,int b) {
		System.out.println("mul method 2:");
		System.out.println(a*b);
	}
	

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.add(33, 77);
		calc.add(77,88,99);
		calc.sub(100, 50);
		calc.sub(700.900, 500.23);
		calc.mul(1000, 780);
		calc.mul(559.342, 778);
		
		
		// TODO Auto-generated method stub

	}

}
