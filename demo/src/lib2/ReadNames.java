package lib2;

import java.io.FileReader;
import java.io.IOException;

public class ReadNames {

	public static void main(String[] args) throws IOException {
		try(FileReader fr = new FileReader("names.txt")) {
			while (true) {
				int ch = fr.read();
				if (ch == -1) 
					break;
				System.out.print((char) ch);
			}
		}
	}

}
