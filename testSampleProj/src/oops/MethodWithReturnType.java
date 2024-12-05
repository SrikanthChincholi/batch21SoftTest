package oops;

import java.util.Scanner;

public class MethodWithReturnType {

	public int add(int a, int b) {
		return a + b;

	}

	public int sub(int a, int b) {
		return a - b;

	}

	public int div(int a, int b) {
		return a / b;

	}

	public int mul(int a, int b) {
		return a * b;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a :");
		int a = sc.nextInt();
		System.out.println("Enter b :");
		int b = sc.nextInt();
		System.out.println("Enter operation : ");
		String operation = sc.next();
		MethodWithReturnType mrt = new MethodWithReturnType();
		switch (operation) {
		case "add": {
			int res = mrt.add(a, b);
			System.out.println("Addition of a and b is :" + res);
			break;

		}
		case "sub": {
			int res = mrt.sub(a, b);
			System.out.println("Substraction of a and b is :" + res);
			break;

		}
		case "div": {
			int res = mrt.div(a, b);
			System.out.println("Division of a and b is :" + res);
			break;

		}
		case "mul": {
			int res = mrt.mul(a, b);
			System.out.println("Multiplication of a and b is :" + res);
			break;

		}
		default: {
			System.out.println("Faulty operation given");
		}
		}

	}

}
