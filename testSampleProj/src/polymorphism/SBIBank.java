package polymorphism;

public class SBIBank extends RBIBank {

	public void getLoanAmt() {
		loan_amt = 45000000;
		int_rates = 6.7f;
		System.out.println("Loan amt for individuals : " + loan_amt);
		System.out.println("Loan interest rates for individuals : " + int_rates);
	}

	public void getLoanAmt(int amt) {
		int_rates = 9.5f;
		System.out.println("Loan amt for individuals : " + amt);
		System.out.println("Loan interest rates for individuals : " + int_rates);
	}

	public static void main(String[] args) {

		SBIBank sbi = new SBIBank();
		sbi.getLoanAmt();
		sbi.getLoanAmt(20000000);

	}
}
