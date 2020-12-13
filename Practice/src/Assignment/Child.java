package Assignment;

public class Child extends Parent {

	public Child() {
		this(1);
		System.out.println("Child default constructor");
	}

	public Child(int a) {
		this(1, 2, 4, 5);
		System.out.println("child 1 parameterized constructor");
	}

	public Child(int a, int b) {

		this(1, 2, 4);
		System.out.println("child 2 parameterized constructor");
	}

	public Child(int a, int b, int c) {
		this();
		System.out.println("child 3 parameterized constructor");
	}

	public Child(int a, int b, int c, int d) {
		super(1);
		System.out.println("child 4 parameterized constructor");
	}

	public static void main(String[] args) {
		Child obj = new Child(1, 2);
		System.out.println("Total lenght of the array is: " + args.length);
		System.out.print(args[0] + " ");
		System.out.print(args[1] + " ");
		System.out.print(args[2] + " ");
		System.out.print(args[3] + " ");
		System.out.print(args[4] + " ");
		System.out.print(args[5] + " ");
		System.out.print(args[6]);
	}

}
