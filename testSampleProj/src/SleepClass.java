
public class SleepClass {

	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 19; i++) {
			System.out.print(i);
			Thread.sleep(1000);
		}
	}

}
