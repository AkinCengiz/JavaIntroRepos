package fileprocess;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputTest {

	public static void main(String[] args) {
		FileOutputStream fileOutputStream = null;
		try {
			//fileOutputStream = new FileOutputStream("test.txt");
			fileOutputStream = new FileOutputStream("test.txt",true);
			//fileOutputStream.write(65);
			String metin = "Ayşe Fatma";
			metin +="\r\n";
			byte[] arr = metin.getBytes();
			fileOutputStream.write(arr);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				System.out.println("Dosya I/O Hatasi Olustu...");
				e.printStackTrace();
			}
		}
		System.out.println("Program closing...");
	}

}
