package polymorphism;

public class RBIBank {

	static int loan_amt ;
	static float int_rates;
	String address;
	String loc;

	private void getLoanAmt() {// private , final , static cannot be overridden
		loan_amt = 1000000;
		int_rates = 5.5f;
		System.out.println("Loan amt for individuals : " + loan_amt);
		System.out.println("Loan interest rates for individuals : " + int_rates);
	}

	public void getLoanAmt(int amt) {
		System.out.println("Loan amt for individuals : " + amt);
		System.out.println("Loan interest rates for individuals : " + int_rates);
		
	}

	public void getLoanAmt(int amt, float rates) {
		System.out.println("Loan amt for individuals : " + amt);
		System.out.println("Loan interest rates for individuals : " + rates);
	}

	public void getLoanAmt( int amt, float rates,String ...args) {
		System.out.println("Loan amt for individuals : " + amt);
		System.out.println("Loan interest rates for individuals : " + rates);
		System.out.println("Address of the bank :" + args[0]);
		System.out.println("Location of the bank : " + args[1]);
		System.out.println("Address of the bank :" + args[2]);
		System.out.println("Location of the bank : " + args[3]);
	}

	public static void main(String[] args) {

		RBIBank rbi = new RBIBank();
		rbi.getLoanAmt();
		rbi.getLoanAmt(20000000);
		rbi.getLoanAmt(3000000, 4.5f);
		//rbi.getLoanAmt(3000000, 5.6f, "Hyd", "Nampally","Sec","WestMaredpally");

	}

}
