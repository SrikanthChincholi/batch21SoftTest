package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamClass {
	public static void main(String[] args) throws IOException {

		String filepath = System.getProperty("user.dir") 
				+ "\\DataFiles\\FileStreamWritingdata.txt";
		FileOutputStream fos = new FileOutputStream(filepath);
		String str = "This is a file created using fos Writer Class";
		byte b[] = str.getBytes();
		fos.write(b);
		fos.close();
		System.out.println("File writing completed ");

	}
}
