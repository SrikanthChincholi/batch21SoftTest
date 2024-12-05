package polymorphism;

public class ICICIBank extends RBIBank {

	public void getLoanAmt() {
		loan_amt = 90000000;
		int_rates =10.5f;
		System.out.println("Loan amt for individuals : " + loan_amt);
		System.out.println("Loan interest rates for individuals : " + int_rates);
	}

	public void getLoanAmt(int amt) {
		int_rates =11.5f;
		System.out.println("Loan amt for individuals : " + amt);
		System.out.println("Loan interest rates for individuals : " + int_rates);
	}

	public static void main(String[] args) {

		ICICIBank icici = new ICICIBank();
		icici.getLoanAmt();
		icici.getLoanAmt(2000000000);

	}
}
