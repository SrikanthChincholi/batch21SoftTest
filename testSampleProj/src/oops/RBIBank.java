package oops;

public class RBIBank {

	float intRate = 5.0f;
	long amt = 3000000;

	public void intRates() {
		System.out.println("RBI int rates are " + intRate);
	}
	public void intRates(float rate) {
		System.out.println("RBI enhanced int rates  " + rate);
	}
	public void loanAmt() {
		System.out.println("RBI loan amts are " + amt);
	}
	public void loanAmt(long value) {
		System.out.println("RBI enhanced loan amts are " + value);
	}
	
	public static void main(String[] args) {
		RBIBank rbi = new RBIBank();
		rbi.intRates();
		rbi.intRates(5.5f);
		rbi.loanAmt();
		rbi.loanAmt(45000000l);
	}
	
	

}
