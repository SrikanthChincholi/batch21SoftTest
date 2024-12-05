package constructor;

public class ChainConstructor {

	ChainConstructor(int a, int b) {
		this(10);
		System.out.println("2 Param");
	}

	ChainConstructor(int a) {
		this();
		System.out.println("1 Param");
	}

	ChainConstructor() {
		System.out.println("Default");

	}

	public static void main(String[] args) {
		ChainConstructor cc = new ChainConstructor(10,20);

	}
}
