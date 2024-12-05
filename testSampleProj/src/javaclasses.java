import java.io.IOException;
import java.util.Scanner;

public class javaclasses {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = sc.nextInt();
			
		
		for(int i=0;i<num;i++)
		System.out.print(i);
		
		for(int i=0;i<num;i++)
			System.out.println(i);
		System.out.println(System.currentTimeMillis());
		
		
	}

}


