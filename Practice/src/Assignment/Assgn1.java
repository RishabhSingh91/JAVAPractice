package Assignment;

public class Assgn1 {

	int age, roll_no;
	public void display1()
	{
		System.out.println("This is my first method display1");
	}
	public void display2()
	{
		System.out.println("This is my Second display2");
	}
	public static void main(String[] args) {
		Assgn1 obj = new Assgn1();
		obj.age =28;
		obj.roll_no =4242;
		obj.display1();
		obj.display2();
		System.out.println(obj.age);
		System.out.println(obj.roll_no);
	}

}
