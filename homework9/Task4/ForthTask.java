import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ForthTask {

	public static void TextIntoArray(ArrayList<String> myList) throws IOException {

		BufferedReader reader = new BufferedReader(

				new FileReader("C:\\Users\\Taras\\eclipse-workspace\\HW9\\src\\MyCareer.txt"));

		String m = null;

		while ((m = reader.readLine()) != null) {

			myList.add(m);

		}

		reader.close();

	}

	public static void writeIntoFile(ArrayList<String> myList) {

		try (BufferedWriter Mywriter = new BufferedWriter(

				new FileWriter("C:\\Users\\Taras\\eclipse-workspace\\HW9\\src\\Example.txt"));) {

			Mywriter.write("File Career has  " + myList.size() + " lines");

			String max = Collections.max(myList, Comparator.comparing(s -> s.length()));

			Mywriter.write("\n The longest line in Career txt is: " + max + "");

			Pattern p = Pattern.compile("Taras[0-9]{2}\\.[0-9]{2}\\.[0-9]{4}");
			Matcher m;
			String NameDate;

			Iterator<String> Myit = myList.iterator();

			while (Myit.hasNext()) {
				NameDate = Myit.next();
				String[] myarr = new String[NameDate.length()];
				myarr = NameDate.split(" ");

				for (int i = 0; i < myarr.length; i++) {

					m = p.matcher(myarr[i]);

					if (m.matches()) {

						Mywriter.write("\n Name and Date is : " + myarr[i] + "");
					}
				}

			}

			Mywriter.close();

		} catch (IOException e) {

			System.out.println("Problem in writer method");

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		ArrayList<String> myList = new ArrayList<String>();

		try {

			TextIntoArray(myList);
			writeIntoFile(myList);

		} catch (IOException e) {

			System.out.println("Problem in TextIntoArray");

			e.printStackTrace();
		}

	}
}
