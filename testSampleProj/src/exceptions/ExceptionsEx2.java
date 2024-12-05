package exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionsEx2 {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.out.println(100 / 0);
		String filepath = "";
		FileReader fr = new FileReader(filepath);
		int i;
		while ((i=fr.read()) != -1) {
			System.out.print((char) i);
		}

	}

}
