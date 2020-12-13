package Assignment;

import java.util.Scanner;

public class Assgn2 {

	public double add(double a, double b)
	{
		return a+b;
	}
	public double sub(double a, double b)
	{
		return a-b;
	}
	public double multi(double a, double b)
	{
		return a*b;
	}
	public double div(double a, double b)
	{
		System.out.println("The result of the calculation is"+" "+a/b);
		return a/b;
	}
	
	public void problem1(double a,double b)
	{
		/* ((((10-2)+2)+2)-2)*2)/2) */
		double part1, part2,part3, result;
		Assgn2 obj = new Assgn2();
		part1 =obj.sub(a, b)+b+b;
		part2 =obj.sub(part1, b);
		part3 =obj.multi(part2, b);
		result =obj.div(part3, b);
		
	}
	
	public void problem2(double a,double b)
	{
		/* ((((10*2)-2)+2)*2)+2)/2) */
		double part1, part2,part3, result;
		Assgn2 obj = new Assgn2();
		part1 =obj.multi(a,b)-b+b;
		part2 =obj.multi(part1, b);
		part3 =obj.add(part2, b);
		result =obj.div(part3, b);
		
	}
		
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Assgn2 obj = new Assgn2();
		System.out.println("Please enter the first digit you want to evaluvate");
		double a = s.nextDouble();
		System.out.println("Please enter the second digit you want to evaluvate");
		double b = s.nextDouble();
		obj.problem1(a, b);
		obj.problem2(a, b);
	}

}
