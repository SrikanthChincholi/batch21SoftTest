package controlstatements;

public class SwitchCases {

	public static void main(String[] args) {

		int a = 10;
		char ch = 'a';

		switch (ch) {
		case 'v': {
			System.out.println(" Value of a is 1");
			break;
		}
		case 'j': {
			System.out.println(" Value of a is 11");
			break;
		}
		case 'l': {
			System.out.println(" Value of a is 3");
			break;
		}

		case 'z': {
			System.out.println(" Value of a is 10");
			break;
		}
		case 'y': {
			System.out.println(" Value of a is 4");
			break;
		}
		default: {
			System.out.println("No value is matching ");
		}
	}

	}

}
