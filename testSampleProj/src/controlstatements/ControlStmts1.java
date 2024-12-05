package controlstatements;

import java.util.Scanner;

public class ControlStmts1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age :");
		int age = sc.nextInt();
//		String res = (age > 18 && age < 90) ? "you are eligible for voting !!"
//				: "Sorry you are not eligible for voting !!";
//		System.out.println(res);

		if (age > 18 && age < 90) {
			System.out.println("you are eligible for voting !! ");
			System.out.println("Please vote!! ");
		} else
			System.out.println("Sorry you are not eligible for voting !!");
	}

}
