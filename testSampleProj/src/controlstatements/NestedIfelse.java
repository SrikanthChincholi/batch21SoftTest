package controlstatements;

import java.util.Scanner;

public class NestedIfelse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Are you a indian citizen ? : "); // Y or N
		String ch = sc.next();
		if (ch.charAt(0) == 'Y' || ch.charAt(0) == 'y') {
			System.out.println("Enter your age : ");
			int age = sc.nextInt();
			if (age >= 18 && age <= 100) {
				System.out.println("You are eligible for voting !!");
			} else {
				System.out.println("Sorry you are not eligible for voting !!");
			}
		} else {
			System.out.println("Sorry you are not an indian citizen, go and verify with polling officer !!");
		}

	}

}
