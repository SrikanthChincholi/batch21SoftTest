package strings;

public class StringPrgm {
	
	public static void main(String[] args) {
		reverseMeth1("Srikanth");
		reverseMeth2("Srikanth");
		reverseMeth3("Srikanth");

	}

	public static void reverseMeth1(String name) {
		
		char ch[] = name.toCharArray();
		String res = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			res+=ch[i]; //res = res + ch[i];
		}
		System.out.println(res);
	}

	public static void reverseMeth2(String name) {
		String res = "";
		for (int i = name.toCharArray().length - 1; i >= 0; i--) {
			res+=name.charAt(i); // //res = res + name.CharAt(i);
		}
		System.out.println(res);
	}
	
	public static void reverseMeth3(String name)
	{
		System.out.println(new StringBuilder(name).reverse());
	}
}

//Srikanth
//htankirS