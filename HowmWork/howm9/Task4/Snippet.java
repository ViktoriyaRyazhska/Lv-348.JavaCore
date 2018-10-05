package Task4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Snippet {
	public static void main(String[] args) {
		String fileName = "C:\\\\Users\\\\Nazar619\\\\Desktop\\\\1.txt";
		String fileName2 = "C:\\\\Users\\\\Nazar619\\\\Desktop\\\\2.txt";

		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		String data = null;

 		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			fw = new FileWriter(fileName2);
			bw = new BufferedWriter(fw);
			String s = null;
			String max="";
			int count = 0;
			System.out.println("Read data from file: " + fileName);

			while ((s = br.readLine()) != null) {
				System.out.println(s);
				++count;
				bw.write("\n"+s.length());
				if (max.length() < s.length()) max = s;
				bw.write("\n" +s);
				
			}
			
			bw.write("\n"+"row: " + count);
			bw.write("\n"+"Max: " + max);
			bw.write("\n"+"Max n:" + max.length());
			bw.close();
			br.close();

		} catch (

		Exception e) {
			e.printStackTrace();
		}
	}
}
