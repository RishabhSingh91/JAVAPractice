package Assignment;

public class Assgn4 {
	
	public Assgn4(int a, int b, int c)
	{
		System.out.println("This is three parameterized const");
	}
	public Assgn4()
	{
		this(9,5,6);
		System.out.println("This is default parameterized const");
	}
	public Assgn4(int a, int b, int c, int d)
	{
		this();	
		System.out.println("This is four parameterized const");
	}
	public Assgn4(int a)
	{
		this(9,8,8,7);
		System.out.println("This is one parameterized const");
	}
	public Assgn4(int a, int b)
	{
		this(9);
		System.out.println("This is two parameterized const");
	}
	
	public static void main(String a[])
	{
		Assgn4 obj = new Assgn4(2, 1);
	}

}
