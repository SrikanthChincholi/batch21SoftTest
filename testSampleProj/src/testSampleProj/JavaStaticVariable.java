package testSampleProj;

public class JavaStaticVariable {

	static int val = 10;
	int val1 = 10;

	public static void main(String[] args) {

		JavaStaticVariable jsv = new JavaStaticVariable();
		System.out.println("Val :" + JavaStaticVariable.val++); // static
		System.out.println("Val1 :" + jsv.val1++); // non-static

		JavaStaticVariable jsv1 = new JavaStaticVariable();
		System.out.println("Val :" + JavaStaticVariable.val++); // static
		System.out.println("Val1 :" + jsv1.val1++); // non-static

		JavaStaticVariable jsv2 = new JavaStaticVariable();
		System.out.println("Val :" + JavaStaticVariable.val++); // static
		System.out.println("Val1 :" + jsv2.val1++); // non-static

		JavaStaticVariable jsv3 = new JavaStaticVariable();
		System.out.println("Val :" + JavaStaticVariable.val++); // static
		System.out.println("Val1 :" + jsv3.val1++); // non-static

	}
}
