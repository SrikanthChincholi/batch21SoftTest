package testSampleProj;

public class JavaOperators {

	public static void main(String[] args) {
		JavaOperators jo = new JavaOperators();
		// jo.postincreDecre();
		// jo.preincreDecre();
		// jo.arthematicOper();
		//jo.relationalOper();
		//jo.bitwiseOper();
		//jo.logicalOper();
		jo.ternaryOper();

	}

	public void postincreDecre() {
		int i = 10;
		System.out.println(i++); // i = i + 1;
		i = i + 1; // 12
		System.out.println(i);

		int j = 10;
		System.out.println(j--); // j = j - 1; //10
		j = j - 1; // 8
		System.out.println(j); // 8
	}

	public void preincreDecre() {
		int i = 10;
		System.out.println(++i); // i = i + 1;
		i = i + 1; // 12
		System.out.println(i);

		int j = 10;
		System.out.println(--j); // j = j - 1; //10
		j = j - 1; // 8
		System.out.println(j); // 8
	}

	public void arthematicOper() {
		int i = 10;
		i = i + 20;
		System.out.println("Addition : " + i);
		i = i - 10;
		System.out.println("Substraction : " + i);
		i = i * 10;
		System.out.println("Multiplication : " + i);
		i = i / 10;
		System.out.println("Division : " + i);
		i = i % 10;
		System.out.println("Modulus : " + i);
	}

	public void relationalOper() {
		int i = 10;
		int j = 20;
		if (i > j) {
			System.out.println("i is greater");
		} else {
			System.out.println("j is greater");
		}

		if (i < j) {
			System.out.println("i is lesser");
		} else {
			System.out.println("j is lesser");
		}

		if (i == j) {
			System.out.println("i eqauls j");
		} else {
			System.out.println("i is not equals to j");
		}

		if (i != j) {
			System.out.println("i is not equals to j");
		} else {
			System.out.println("i eqauls j");
		}

		if (i >= j) {
			System.out.println("i is equals to j");
		} else {
			System.out.println("i is not eqauls j and not greater than j ");
		}

		if (i <= j) {
			System.out.println("i is not eqauls j and not lessthan j");
		} else {
			System.out.println(" i is equals to j");
		}
	}

	public void bitwiseOper() {
		int i = 10;
		int j = 10;
		int k = 10;

		if (i >= j & i > k) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		if (i >= j | i > k) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
	
	public void logicalOper() {
		int i = 10;
		int j = 10;
		int k = 10;

		if (i > j && i >= k && k>i) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		if (i >= j || i >= k) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
	
	public void ternaryOper()
	{
		int i = 10;
		int j = 20;
		String str = (i < j)?"this cond is true":"this cond is false"; 
		System.out.println(str);
		
	}

}
