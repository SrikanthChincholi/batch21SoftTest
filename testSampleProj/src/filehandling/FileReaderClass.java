package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderClass {
	public static void main(String[] args) throws IOException {

		String filepath = System.getProperty("user.dir") + "\\DataFiles\\Writingdata.txt";
		FileReader fr = new FileReader(new File(filepath));
		int i;
		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
		}
	}
}
