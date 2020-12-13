package Assignment;

import java.util.Scanner;

public class SwapNum {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int a,b,c;
		
		System.out.println("Enter value a"); a = s.nextInt();
		System.out.println("Enter value b"); b = s.nextInt();
		System.out.println("Enter value c"); c = s.nextInt();
		
		SwapNum.swap(a, b, c);
//		SwapNum.swap();

	}
	public static void swap(int a, int b, int c)
	{
		
		System.out.println("Value of a is "+ a);
		System.out.println("Value of b is "+ b);
		System.out.println("Value of c is "+ c);
		c =b;
		b=a;
		a=c;
		System.out.println("After Swapping value of a is "+ a);
		System.out.println("After Swapping value of b is "+ b);
	}
	public static void swap()
	{
		System.out.println("Please enter the value of a");
		int a = s.nextInt();
		System.out.println("Please enter the value of b");
		int b = s.nextInt();
		a = a+b;
		b = a - b;
		a = a-b;
		System.out.println("Value of a after swapping is"+ a);	
		System.out.println("Value of b after swapping is"+ b);	
		
	}

}
