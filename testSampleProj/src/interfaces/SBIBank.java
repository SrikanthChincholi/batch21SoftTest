package interfaces;

import java.util.Scanner;

public class SBIBank implements RBIBank,RBIBank2,RBIBank3 {

	@Override
	public void eligibityCriteria() {
		System.out.println("Your eligible for loan :" + loan_amt);
		System.out.println("with int rate :" + int_rate);
	}

	@Override
	public void acctHolderDetails() {
		System.out.println("Account holder name : " + name);
	}

	public static void main(String[] args) {
		SBIBank sbi = new SBIBank();
		Scanner sc = new Scanner(System.in);
		System.out.println("Person Credit Score");
		int creditScore = sc.nextInt();
	
		if (creditScore >= 800) {
			sbi.acctHolderDetails();
			sbi.eligibityCriteria();
		} else {
			sbi.acctHolderDetails();
			System.out.println("Sorry do not have enough credit score to obtain loan !!");
		}

	}

	

	

}
