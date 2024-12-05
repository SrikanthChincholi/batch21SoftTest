package methods;

public class MethWithoutParam {

	int a =10;
	int b = 20;

	public void add() {
		int c;
		c = a + b;
		System.out.println("Value of c is : " + c);
	}
	
	public static void main(String[] args) {
		
		MethWithoutParam mwp = new MethWithoutParam();
		mwp.add();
	}

}
