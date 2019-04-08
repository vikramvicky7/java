package files;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileByte {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\nalla.vikram\\Documents\\plsql.txt");
		int i = 0;
		while ((i = fis.read()) != -1) {
			System.out.print((char) i);
		}
	}

}
