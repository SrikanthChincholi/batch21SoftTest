package oops;

public class SBI extends RBIBankEx {
	
	
	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.provideIntrateAndLoanDetails();
	}

	@Override
	void intRate() {
		Int_rate = 5;
		System.out.println("Interest Rate of SBI : "+Int_rate);
		}

	@Override
	void loanAmt() {
		Loan_amt = 50000000;
		System.out.println("Loan Amount of SBI : "+Loan_amt);
	}

	public void provideIntrateAndLoanDetails() {
		intRate();
		loanAmt();

	}

}