package strings;

public class StringBuildClass {
	
	public static void main(String[] args) {
		
		StringBuilder buff = new StringBuilder("Srikanth");
		buff.append(" Chincholi").append(" is").append(" My").append(" Name !!");
		System.out.println(buff);
		System.out.println(buff.reverse());
		System.out.println(buff.capacity());
		System.out.println(buff.length());
		
		System.out.println(buff.delete(0, 8));
		char ch[] = "This to test This to test ".toCharArray();
		System.out.println(buff.insert(10, ch, 6, ch.length-6));
		System.out.println(buff);
		System.out.println(buff.replace(0, 10, "TESTING"));
	}

}
