package methods;

public class MethWithoutreturnType {

	int a =10;
	int b = 20;

	public void add() {
		int c;
		c = a + b;
		System.out.println("Value of c is : " + c);
	}
	
	public static void main(String[] args) {
		
		MethWithoutreturnType mwp = new MethWithoutreturnType();
		mwp.add();
	}

}
