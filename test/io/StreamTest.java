package test.io;

import java.io.*;

public class StreamTest {

	public static void main(String[] args) {
		try {
			DataOutputStream dout = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("DataOut.txt")));
			dout.writeInt(100);
			dout.writeDouble(5.7);
			dout.close();
			
			DataInputStream din = new DataInputStream(new BufferedInputStream(new FileInputStream("DataOut.txt")));
			int a = din.readInt();
			double b = din.readDouble();
			din.close();
			System.out.println(a);
			System.out.println(b);

			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();	
		} catch (IOException e) {
			e.printStackTrace();
		
		}
		
	}

}
