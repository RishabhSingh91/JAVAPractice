package Assignment;

import java.util.Scanner;

public class PatternCreation {
	
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		PatternCreation obj = new PatternCreation();
		obj.NormalPatt();
		obj.decrementPatt();
		obj.NumPrint();
		obj.SkipNum();
		obj.SpaceStar();
		obj.MultiStar();
	}
	
	public void NormalPatt()
	{
		int patt;
		System.out.println("Please enter the size of patterb you want to design Suggested is above 5");
		patt = s.nextInt();
		for(int i=1; i <=patt;i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void decrementPatt()
	{
		int patt;
		System.out.println("Please enter the size of patterb you want to design Suggested is above 5");
		patt = s.nextInt();
		for (int i = patt; i >=0; i--) {
			for (int j = i; j >=0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void NumPrint()
	{
		int patt;
		System.out.println("Please enter the size of patterb you want to design Suggested is above 5");
		patt = s.nextInt();
		for (int i = 1; i <= patt; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public void SkipNum()
	{
		int patt;
		System.out.println("Please enter the size of patterb you want to design Suggested is above 5");
		patt = s.nextInt();
		int count =1;
		for (int i = 1; i <=patt; i++) {
			for (int j = 1; j <=i; j++) {
			
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
	}
	public void SpaceStar()
	{
		int patt;
		System.out.println("Please enter the size of patterb you want to design Suggested is above 5");
		patt = s.nextInt();
		int count=1;
		for (int i = patt; i>=0; i--) {
			for(int j=i; j>=0;j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= count; k++) {
				System.out.print("*");
			}
			System.out.println();
			count++;
		}
	}
	
	public void MultiStar()
	{
		int patt;
		System.out.println("Please enter the size of patterb you want to design Suggested is above 5");
		patt = s.nextInt();
		int count=1;
		for (int i = patt; i>=0; i--) {
			for(int j=i; j>=0;j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= count; k++) {
				System.out.print("*");
			}
			System.out.println();
			count = count+2;
	}

}}
