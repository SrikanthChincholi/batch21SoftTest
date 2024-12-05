package testSampleProj;

public class JavaDatatypes {
	
	boolean bool = true;
	char ch = 'c'; 
	byte b = 20;
	short sh = 3456; 
	int i = 2323223;
	long l = 3243434333535355l;
	float f = 34.56767f;
	double d = 234.4544665567567;
	
	public void getDefaultValues() {
	
		System.out.println("Boolean : " + bool);
		System.out.println("Character : " + ch);
		System.out.println("Byte : " + b);
		System.out.println("Short : " + sh);
		System.out.println("Integer : " + i);
		System.out.println("Long : " + l);
		System.out.println("Float : " + f);
		System.out.println("Double : " + d);
		
	}
	
	public static void main(String arg[])
	{
		JavaDatatypes jdt = new JavaDatatypes();
		jdt.getDefaultValues();
	}

}
