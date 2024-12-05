package constructor;

public class TestConstructor {

	int a;
	int b;

	public TestConstructor(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Parameterized Constructor with 2 params");
	}
	
	public TestConstructor(int a) {
		this.a = a;
		System.out.println("Parameterized Constructor with 1 param");
	}

	public TestConstructor() {
		System.out.println("Default Constructor");
	}

	public static void main(String[] args) {
		TestConstructor tc = new TestConstructor();
		TestConstructor tc1 = new TestConstructor(10, 20);
		TestConstructor tc2 = new TestConstructor(10);
	}

}
