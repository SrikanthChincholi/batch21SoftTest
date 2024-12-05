package oops;

public class AXISBANK extends RBIBankEx {
	
	
	public static void main(String[] args) {
		AXISBANK sbi = new AXISBANK();
		sbi.provideIntrateAndLoanDetails();
	}

	@Override
	void intRate() {
		Int_rate = 7;
		System.out.println("Interest Rate of AXISBANK : "+Int_rate);
		}

	@Override
	void loanAmt() {
		Loan_amt = 750000000;
		System.out.println("Loan Amount of AXISBANK : "+Loan_amt);
	}

	public void provideIntrateAndLoanDetails() {
		intRate();
		loanAmt();

	}

}