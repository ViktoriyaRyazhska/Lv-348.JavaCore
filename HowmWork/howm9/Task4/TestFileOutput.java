package Task4;

import java.io.*;

public class TestFileOutput {
	public static void main(String[] args) {

		String fileName = "C:\\Users\\Nazar619\\Desktop\\1.txt";
		String fileName1 = "C:\\Users\\Nazar619\\Desktop\\2.txt";
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
	

		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			fw = new FileWriter(fileName1);
			bw = new BufferedWriter(fw);
			String s = null;
			int count = 0;
			System.out.println("Read data from file: " + fileName);
			while ((s = br.readLine()) != null) {
				System.out.println("Write data to file: " + fileName1);
				for (int i = (int) (Math.random() * 10); --i >= 0;) {
					bw.write(fileName1);
			}
			
			}
			bw.close();
			
//			
//			fw = new FileWriter(fileName1);
//			bw = new BufferedWriter(fw);
//			System.out.println("Write data to file: " + fileName1);
//			for (int i = (int) (Math.random() * 10); --i >= 0;) {
//				bw.write(fileName1);
//			}
//			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
