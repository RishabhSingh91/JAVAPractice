package Assignment;

public class MethOvr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethOvr obj = new MethOvr();
		obj.Method1();
		obj.Method3(1, 2);
	}
	public void Method1()
	{
		this.Method6(1, 2, 3);
		System.out.println("This is default method");
	}
	public void Method2(int a)
	{
		this.Method5(1, 2, 3, 4);
		System.out.println("This is 1 parameterized method");
	}
	public void Method3(int a, int b)
	{
		this.Method4(1, 2, 3);
		System.out.println("This is 2 parameterized method");
	}
	public void Method6(int a,int b, int c)
	{
		System.out.println("3 parameterized method");
	}
	public void Method4(int a, int b, int c)
	{
		this.Method2(1);
		System.out.println("This is 3 parameterized method");
	}
	public void Method5(int a, int b, int c,int d)
	{
	
		System.out.println("This is 4 parameterized method");
	}
}
