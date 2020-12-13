package Assignment;

public class Parent {

	public Parent() {
		
		System.out.println("Parent default constructor");
	}

	public Parent(int a) {
		this(1,2);
		System.out.println("parent 1 parameterized constructor");
	}

	public Parent(int a, int b) {
		this(1,2,3,4);
		System.out.println("parent 2 parameterized constructor");
	}

	public Parent(int a, int b, int c) {
		this();
		System.out.println("parent 3 parameterized constructor");
	}

	public Parent(int a, int b, int c, int d) {
		this(1,2,3);
		System.out.println("parent 4 parameterized constructor");
	}

}
