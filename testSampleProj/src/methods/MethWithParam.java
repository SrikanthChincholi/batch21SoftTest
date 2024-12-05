package methods;

public class MethWithParam {

	public void add(int a, int b) {
		int c;
		c = a + b;
		System.out.println("Value of c is : " + c);
	}
	
	public static void main(String[] args) {
		
		MethWithParam mwp = new MethWithParam();
		mwp.add(10,20);
	}

}
