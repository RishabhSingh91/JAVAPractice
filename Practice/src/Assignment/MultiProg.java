package Assignment;

import java.util.Scanner;

public class MultiProg {

	public static void main(String[] args) {

		MultiProg obj = new MultiProg();
		obj.Prime();
//    	obj.Palindrome();
//		obj.ArmStrong();
//		obj.Table();
//		obj.Factorial();
//		obj.fabonnaci();

	}

	public void Prime() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please the number that you want to verify if Prime or not");
		int a = s.nextInt();
		int c = 0;
		int prime = 0;
		int i = 1;
		while (i <= a) {
			c = a % i;
			if (c == 0) {
				prime++;
				System.out.println("Number is divisible by " + i);
			}
			i++;
		}

		if (prime <= 2) {
			System.out.println("The number is prime");
		} else {
			System.out.println("Not prime");
		}

	}

	public void Palindrome() {
		int num, temp, rem;
		int revreseNum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Print the number you want to verify for palindrome");
		num = s.nextInt();
		temp = num;
		while (temp != 0) {
			rem = temp % 10;
			revreseNum = revreseNum * 10 + rem;
			temp = temp / 10;
		}
		System.out.println("Reverse of the number is " + revreseNum);
		if (revreseNum == num) {
			System.out.println("The number is palindrome");
		} else {
			System.out.println("The number is not palindrome");
		}

	}

	public void ArmStrong() {
		int num, temp, rem;
		int armNum = 0;
		System.out.println("Please enter the number you want to verify for armstrong");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		temp = num;

		while (temp != 0) {
			rem = temp % 10;
			armNum = armNum + rem * rem * rem;
			temp = temp / 10;
		}
		System.out.println("The number after adding and multiplying is " + armNum);
		if (armNum == num) {
			System.out.println("Number is armstrong number");
		} else {
			System.out.println("Number is not an armstrong number");
		}
	}

	public void Table() {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number for which you want to print table");
		num = s.nextInt();
		int digit = num;
		for (int i = 1; i <= 10; ++i) {
			num = num * i;
			System.out.println(digit + " * " + i + " = " + num);
			num = digit;
		}
	}

	public void Factorial() {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the number for which you want to get factorial for");
		num = s.nextInt();
		int digit = num;
		int i = 1;
		while (i < digit) {
			num = num * i;
			i++;

		}
		System.out.println("Factorial of number is " + num);
	}
	
	public void fabonnaci()
	{
		int num;
		System.out.println("Please enter the number for which you need to find fibonnaci series");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		int digit = num;
		int num0=0;
		int i=2;
		int num1=1;
		System.out.print(num0+","+num1);
		while(i<digit)
		{
			
			 int numF;
			 numF = num0+num1; 
			 num0=num1; 
			 num1 = numF;
			 System.out.print(","+numF);
			
			 i++;
		}
	}

}
