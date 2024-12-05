package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileInputStreamClass {
	static String filepath = System.getProperty("user.dir") + "\\DataFiles\\FileStreamWritingdata.txt";

	public static void main(String[] args) throws IOException {
		read1();
		read2();
		read3();
	}

	public static void read1() throws IOException {
		FileInputStream fis = new FileInputStream(filepath);
		int i;
		while ((i = fis.read()) != -1)
			System.out.print((char) i);
	}

	public static void read2() throws IOException {
		FileInputStream fis = new FileInputStream(filepath);
		String str = new String(fis.readAllBytes());
		System.out.println(str);

	}
	
	public static void read3() throws IOException {
		FileInputStream fis = new FileInputStream(filepath);
		String str = new String(fis.readAllBytes(), StandardCharsets
				.UTF_8);
		System.out.println(str);

	}
}
