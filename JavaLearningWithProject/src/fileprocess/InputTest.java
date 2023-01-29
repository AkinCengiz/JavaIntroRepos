package fileprocess;

import java.io.FileInputStream;
import java.io.IOException;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = null;
		
		try {
			fileInputStream = new FileInputStream("test.txt");
//			char c = (char)fileInputStream.read();
//			System.out.println(c);
			String metin = "";
			int character;
			while((character = fileInputStream.read()) != -1)
			{
				metin += (char)character;				
			}
			System.out.println(metin);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				System.out.println("Dosya I/O Hatasi Olustu...");
				e.printStackTrace();
			}
		}
		System.out.println("Program closing...");
	}

}
