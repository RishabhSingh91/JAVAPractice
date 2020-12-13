package Assignment;

public class Assgn3 {

	public Assgn3(int a, int b, int c) {
		this(1);
		System.out.println("This is three prameterized const");
	}

	public Assgn3(int a) {
		this(8, 9);
		System.out.println("This is one parameterized const");
	}

	public Assgn3(int a, int b) {
		this();
		System.out.println("Two parameterized const");
	}

	public Assgn3() {
		this(9, 2, 5, 6);
		System.out.println("Default paramterized const");
	}

	public Assgn3(int a, int b, int c, int d) {

		System.out.println("This is four prameterized const");
	}

	public static void main(String[] a) {
		Assgn3 obj = new Assgn3(9, 8, 7);
	}

}
