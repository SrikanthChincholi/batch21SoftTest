package exceptions;

import java.util.Scanner;

public class ThrowException {

	public static void main(String[] args) throws AgeException, Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age :");
		int age = sc.nextInt();
		if (age >= 18 && age < 100) {
			System.out.println("Please wait for checking nationality !!");
			System.out.println("Enter your nationality : ");
			String nationality = sc.next();
			if (nationality.equalsIgnoreCase("Indian")) {
				System.out.println("Please go for Voting !!");
			} else {
				throw new Exception("Sorry you are not eligible to vote !!");
			}
		} else {
			throw new AgeException("Sorry you are not eligible to vote as your under age of 18 !!");
		}

	}

}
