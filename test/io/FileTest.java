package test.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileTest {

	public static void main(String[] args) {
		try {
		FileWriter fw = new FileWriter("Test.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String text = "Hello World \n";
		bw.write(text,0,text.length());
		String text2 = "To infinity and beyond";
		bw.write(text2,0,text2.length());
		bw.close();
		
		FileReader fr = new FileReader("Test.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
	    while (line!=null) {
	        System.out.println(line);
	        line = br.readLine();
	   
	   }
	    fr.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
