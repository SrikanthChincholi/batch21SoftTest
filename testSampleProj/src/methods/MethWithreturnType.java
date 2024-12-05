package methods;

public class MethWithreturnType {

	int a = 10;
	int b = 20;

	public int add() {
		return a + b;

	}

	public float sub() {
		return a - b;

	}

	public boolean greatervalue(int a, int b) {
		if (a > b)
			return true;
		else
			return false;
	}
	
	public boolean greatervalue() {
		if (a > b)
			return true;
		else
			return false;
	}
	
	public void greatervalueTest() {
		if (a > b)
			System.out.println(true);
		else
			System.out.println(false);
	}

	public static void main(String[] args) {

		MethWithreturnType mwp = new MethWithreturnType();
		System.out.println("Value of c is : " + mwp.add());
		System.out.println("Value of f is : " + mwp.sub());
		System.out.println(mwp.greatervalue(30,20));
		System.out.println(mwp.greatervalue(100,20));
		System.out.println(mwp.greatervalue(40,10));
		System.out.println(mwp.greatervalue());
		mwp.greatervalueTest();
	}

}
