import java.util.regex.Matcher;
import java.util.regex.Pattern;

// TASK2
public class Spaces {

	public static void main(String[] args) {

		String spaseSentence = "HI    Have  a    beautiful   day  !....   Ok             thank     you.";

		System.out.println(spaseSentence);

		spaseSentence = spaseSentence.replaceAll("[\\s]+", " ");

		System.out.println(spaseSentence);
		
		
		/*  .....................OR................

		final Pattern CLEAR_Spases = Pattern.compile("[\\s]+");

		System.out.println(CLEAR_Spases.matcher(spaseSentence).replaceAll(" ").trim());
		
		
		
		.....................OR....................

		final Pattern CLEAR_Spases = Pattern.compile("[\\w!.]" + "[ ]{0,1}");

		Matcher m = CLEAR_Spases.matcher(spaseSentence);

		while (m.find()) {

			System.out.print(spaseSentence.substring(m.start(), m.end()) + "");
			}

         */
		

	}

}
