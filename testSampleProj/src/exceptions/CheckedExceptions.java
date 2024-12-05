package exceptions;

import java.beans.Statement;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExceptions {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {

		File file = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\Sample.txt");
		FileReader fr = new FileReader(file);
		int i;
		while ((i = fr.read()) != -1)
			System.out.print((char) i);

		// Class.forName("");
		Connection con = DriverManager.getConnection("");

	}

}
