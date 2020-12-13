package HomePractice;

public class Class2 extends Class1 {
	
	public int arthematic(int a, int b)
	{
		int c = a * b;
		System.out.println("method Child mul "+ c);
		super.arthematic(10, 5);
		return c;
	}
	public static void main(String [] args) {
		int a;
		a =10;
		System.out.println("Non static local variable "+ a);
		Class2 obj = new Class2();
		obj.arthematic(5, 7);
		
	}

}
