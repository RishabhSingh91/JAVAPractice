package HomePractice;

import java.util.Scanner;

public class Calc1 extends Calc {

	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Calc1 obj = new Calc1();
		obj.calculator();

	}

	public void calculator() {
//		Calc obj = new Calc();
		String a = "yes";
		float a1, b;
		float c = 1;
		String res;
		while (a.equalsIgnoreCase("Yes")) {
			System.out.println("Please enter the operation you want to execute i.e. 'add/sub/mul/div/mod'");
			res = s.next();
			res = res.toLowerCase();
			System.out.println("Please enter the first number for which you want to solve the problem");
			a1 = s.nextFloat();
			System.out.println("Please enter the second number for which you want to solve the problem");
			b = s.nextFloat();

			switch (res) {
			case "add":
				c = super.add(a1, b);
				System.out.println("The addition of the numbers is"+" " +c);
				System.out.println("Do you want to continue? Yes/No");
				a = s.next();
				break;
			case "sub":
				c = super.sub(a1, b);
				System.out.println("The subtraction of the numbers is"+" " +c);
				System.out.println("Do you want to continue? Yes/No");
				a = s.next();
				break;
			case "mul":
				c = super.mul(a1, b);
				System.out.println("The multipication of the numbers is"+" " +c);
				System.out.println("Do you want to continue? Yes/No");
				a = s.next();
				break;
			case "div":
				c = super.div(a1, b);
				System.out.println("The division of the numbers is"+" " +c);
				System.out.println("Do you want to continue? Yes/No");
				a = s.next();
				break;
			case "mod":
				c = super.mod(a1, b);
				System.out.println("The modulus of the numbers is"+" " +c);
				System.out.println("Do you want to continue? Yes/No");
				a = s.next();
				break;

			}

		}

	}

}
