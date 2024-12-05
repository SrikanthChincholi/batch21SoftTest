package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterClass {
	public static void main(String[] args) throws IOException {

		String filepath = System.getProperty("user.dir") + "\\DataFiles\\BufferedWritingdata.txt";
		BufferedWriter bw = new BufferedWriter(new FileWriter(filepath));
		bw.write("This is a file created using Buffered Writer Class");
		bw.close();
		System.out.println("File writing completed ");

	}
}
