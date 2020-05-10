package test.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileTest {

	public static void main(String[] args) {
		try {
		FileWriter fw = new FileWriter("Test.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String text = "Hello World";
		bw.write(text,0,text.length());
		bw.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
