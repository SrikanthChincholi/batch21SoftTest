package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsVsThrow {

	public static void main(String[] args) throws Exception {
		{
			try {
				File file = new File("");
				FileReader fr = new FileReader(file);
			} catch (Exception e) {
				e.printStackTrace();
			}
			int a = 12;
			if (a > 11) {
				System.out.println(true);
			} else {
				throw new Exception("a is not greater than 11");
			}
		}
	}

}
