package oops;

public abstract class RBIBankEx {

	int Int_rate;
	int Loan_amt;

	RBIBankEx() {
		System.out.println(" Notice that interest rates and loan amounts follow RBI Guidelines !!");
	}

	abstract void intRate();

	abstract void loanAmt();

	public static void test() {
	}

}
