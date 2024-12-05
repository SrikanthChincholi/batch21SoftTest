package arrays;

public class ArrayObjects {

	public static void main(String[] args) {

		Students st[] = new Students[5];
		st[0] = new Students("Srikanth", 12, "CSE", "Aurora");
		st[1] = new Students("Chandu", 23, "ECE", "Aurora");
		st[2] = new Students("Aaryan", 45, "EEE", "Aurora");
		st[3] = new Students("Pranav", 56, "IT", "Aurora");
		st[4] = new Students("Santhosh", 67, "IT", "Aurora");

		for (Students s : st) {
			s.display();
			System.out.println("*******************************");
		}

	}

}
