package testSampleProj;

import java.util.Scanner;

public class MulitplicationTable {

	public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);
		//System.out.println("Please enter value for multiplication :");
		//int a = sc.nextInt();
		for (int j = 1; j <= 20; j++) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(j + " * " + i + "  = " + (j * i));
			}
			System.out.println("******************");
		}
	}

}
