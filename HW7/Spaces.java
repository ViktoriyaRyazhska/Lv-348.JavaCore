package homeWork7;

public class Spaces {

	public static void main(String[] args) {
		
		String str = "I   am  learning          Java                 Core";
		System.out.println(str);
		
		while (str.contains("  ")) {
			String s1 = str.replace("  ", " ");
			str = s1;
		}
		System.out.println(str);
		
		while (str.contains("I am")) {
			String s1 = str.replace("I am", "I'm");
			str = s1;
		}
		System.out.println(str);
		
		String str1 = "My          name   is   Nazarii";
		System.out.println(str1);
		System.out.println(str1.replaceAll("[ ]+", " "));
	}

}
