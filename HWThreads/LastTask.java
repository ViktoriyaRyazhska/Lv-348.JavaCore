import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastTask {

	static List<String> arr  = new ArrayList<String>();
	 String[] sArr;
	static String need = "Maksym Burko";
	
	public static void main(String[] args) {
		
		BufferedReader br;
		String s = null;
		
		try {
			br = new BufferedReader(new FileReader("file1.txt"));
			System.out.println("Read from file: 'file1.txt'");
			
			while((s = br.readLine()) !=null) {
				arr.add(s);
			}
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println(arr.toString());
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("file2.txt"));) {
			System.out.println("Write to file: 'file2.txt'");
			
			bw.write("Number of lines in 'file1.txt': " + arr.size());
			bw.write("\nThe longest line in 'file1.txt' is: " + getLongLine(arr));
			bw.write("\nDate of birth is: " + getBirthday(arr));

		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
	public static String getLongLine(List<String> arr) throws IOException{
		int longLine = 0;
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i).length() > arr.get(longLine).length()) {
				longLine = i;
			}
		}
		String s = arr.get(longLine);
		return s;
	}
	
	public static String getBirthday(List<String> arr) throws IOException{
		
		 Pattern p = Pattern.compile("[0-9]{2}\\.[0-9]{2}\\.[0-9]{4}");
	     Matcher m;
	     String date;
	     
	     Iterator<String> it = arr.iterator();
	     
	     while(it.hasNext()) {
	    	 date = it.next();
	    	 String[] arrStr = new String[date.length()];
	    	 arrStr = date.split(" ");
	    	 
	    	 for (int i = 0; i < arrStr.length; i++) {
	                m = p.matcher(arrStr[i]);
	                if (m.matches()) {
	                    return arrStr[i];
	                }
	    	 }
	    	 
	     }
		
		return "";
	}
	
}
