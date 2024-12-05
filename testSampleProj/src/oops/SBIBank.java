package oops;

public class SBIBank extends RBIBank{
	
	
	public static void main(String[] args) {
		SBIBank sbi = new SBIBank();
		sbi.intRate = 7.0f;
		sbi.amt = 35000000;
		sbi.intRates();
		sbi.loanAmt();
		
	}
	
	public void intRates() {
		System.out.println("SBI int rates are " + intRate);
	}

	public void loanAmt() {
		System.out.println("SBI loan amts are " + amt);
	}

}
