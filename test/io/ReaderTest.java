package test.io;
import java.io.*;

public class ReaderTest {

	public static void main(String[] args) {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		try {
			//int c = ir.read();
			String name = br.readLine();
			//System.out.println(c);
			//System.out.println((char)c);
			System.out.println(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
