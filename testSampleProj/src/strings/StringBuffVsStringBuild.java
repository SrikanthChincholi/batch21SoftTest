package strings;

public class StringBuffVsStringBuild {

	public static void main(String[] args) throws InterruptedException {

		StringBuffer buff = new StringBuffer();
		StringBuilder build = new StringBuilder();

		long strtime = System.currentTimeMillis();
		long endtime;

		for (long i = 0; i < 10000000l; i++) {
			buff.append(" ");
			//Thread.sleep(2);
		}
		endtime = System.currentTimeMillis();
		System.out.println("Buffer taken time to process " + (endtime - strtime));
		
		
		strtime = System.currentTimeMillis();
		for (long i = 0; i < 10000000l; i++) {
			build.append(" ");
			//Thread.sleep(2);
		}
		endtime = System.currentTimeMillis();
		System.out.println("Bulider taken time to process " + (endtime - strtime));

	}

}
