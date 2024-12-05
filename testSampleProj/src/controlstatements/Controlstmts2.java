package controlstatements;

import java.util.Scanner;

public class Controlstmts2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter percentage of student");
		int marks = sc.nextInt();

		if (marks >= 70 && marks <= 100) {
			System.out.println("Distinction !!");
		} else if (marks >= 60 && marks <= 69) {
			System.out.println("First !!");
		} else if (marks >= 40 && marks <= 59) {
			System.out.println("Second !!");
		} else if (marks >= 35 && marks <= 39) {
			System.out.println("Third !!");
		} else {
			System.out.println("Failed !!");
		}
	}

}
