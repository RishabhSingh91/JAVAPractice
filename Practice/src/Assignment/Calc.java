package Assignment;

import java.util.Scanner;

public class Calc {
	static String a1;
	static Scanner s = new Scanner(System.in);

	public Calc() {
		System.out.println("Please enter the function you want to perform for the problem begining with 'add or multi'");
		a1 = s.next().toLowerCase();
		this.opertation(a1);		
	}

	public float add(float a, float b) {
		return a + b;
	}

	public float sub(float a, float b) {
		return a - b;
	}

	public float multi(float a, float b) {
		return a * b;
	}

	public float div(float a, float b) {
		return a / b;
	}

	public void opertation(String a) {
		
		float a1, c, d, e, f, g, h, i, j, k, l, m;
		System.out.println("Please enter the first digit you want calculate");
		a1 = s.nextFloat();
		float b;
		System.out.println("Please enter the second digit you want calculate");
		b = s.nextFloat();
		switch (this.a1) {
		case "add":
//			to solve (((((x1+x2)-x3)+x4)*x5)/x6)
			c = this.add(a1, b);
			System.out.println("Please enter the digit you want to subtract the product with");
			d = s.nextFloat();
			e = this.sub(c, d);
			System.out.println("Please enter the digit you want to add the product with");
			f = s.nextFloat();
			g = this.add(e, f);
			System.out.println("Please enter the digit you want to multiply the product with");
			h = s.nextFloat();
			i = this.multi(g, h);
			System.out.println("Please enter the digit you want to divide the product with");
			j = s.nextFloat();
			k = this.div(i, j);
			System.out.println("The product of the problem '(((((x1+x2)-x3)+x4)*x5)/x6)' is" + k);
			break;
		case "multi":
//			to solve (((((x1*x2)-x3)+x4)-x5)/x6)
			c = this.multi(a1, b);
			System.out.println("Please enter the digit you want to subtract the product with");
			d = s.nextFloat();
			e = this.sub(c, d);
			System.out.println("Please enter the digit you want to add the product with");
			f = s.nextFloat();
			g = this.add(e, f);
			System.out.println("Please enter the digit you want to subtract the product with");
			h = s.nextFloat();
			i = this.sub(g, h);
			System.out.println("Please enter the digit you want to divide the product with");
			j = s.nextFloat();
			k = this.div(i, j);
			System.out.println("The product of the problem '(((((x1*x2)-x3)+x4)-x5)/x6)' is" + k);
			break;

		}
	}

}
