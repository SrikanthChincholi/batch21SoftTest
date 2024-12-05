package sampleJavaPrgms;

public class SwappingNumber {

	public static void main(String[] args) {
		
		int a = 302;
		int b = 430;
		int temp;
		
		System.out.println(" Before swapping a is " + a);
		System.out.println(" Before swapping b is " + b);
		
		temp =a ; // 30
		a = b; // 40
		b= temp; // 30
		
		System.out.println(" After swapping a is " + a);
		System.out.println(" After swapping b is " + b);
		
	}
}
