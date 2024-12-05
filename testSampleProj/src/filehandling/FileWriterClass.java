package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {

	public static void main(String[] args) throws IOException {

		String filepath = System.getProperty("user.dir") + "\\DataFiles\\Writingdata.txt";
		FileWriter fw = new FileWriter(new File(filepath));
		fw.write("This is a file created using File Writer");
		fw.close();
		System.out.println("File writing completed ");

	}

}
