package filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class Files {

	public static void main(String[] args) throws IOException {

		String filepath = System.getProperty("user.dir") + "\\DataFiles";
		File fp = new File(filepath);
		if (fp.isDirectory()) {
			File[] files = fp.listFiles();
			for (File f : files) {
				System.out.println(f.getName());
			}

			File file = new File(filepath + "\\Test123.txt");
			if (file.exists()) {
				System.out.println("File exists");
				System.out.println(file.getCanonicalPath());
				boolean canRead = file.canRead();
				System.out.println(canRead);
				boolean write = file.canWrite();
				System.out.println(write);
				boolean hidden = file.isHidden();
				System.out.println(hidden);
				System.out.println(file.getName());
				System.out.println(file.isDirectory());
				System.out.println(file.getAbsolutePath());
				// System.out.println(file.delete());
				System.out.println(file.equals(file));
				System.out.println(file.lastModified());
				File ff = new File(System.getProperty("user.dir")+ "\\DataFiles\\TESTTEST123456.txt");
				System.out.println(file.renameTo(ff));
				System.out.println(Paths.get(file.getAbsolutePath()));

			} else {
				file.createNewFile();
				System.out.println(file.getCanonicalPath());
				System.out.println(file.getParent());
				System.out.println(file.isDirectory());

			}
		} else {
			fp.mkdir();
		}

	}

}
