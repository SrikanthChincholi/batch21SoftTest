package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderClass {

	static String filepath = System.getProperty("user.dir") + "\\DataFiles\\BufferedWritingdata.txt";
	static BufferedReader br;

	public static void main(String[] args) throws IOException {

		readBuffData1();
		readBuffData2();
	}

	public static void readBuffData1() throws IOException {
		br = new BufferedReader(new FileReader(filepath));
		int i;
		while ((i = br.read()) != -1) {
			System.out.print((char) i);
		}
		br.close();
	}

	public static void readBuffData2() throws IOException {
		br = new BufferedReader(new FileReader(filepath));
		String read = "";
		while ((read = br.readLine()) != null)
			System.out.println(read);
		br.close();

	}
}
