package j_tenth_lesson.HW10;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class myCareer {
    private String fileName = "C:\\Users\\vital\\IdeaProjects\\LMS_SoftServe\\src\\j_tenth_lesson\\HW10\\myCareer.txt";
    private String secondName = "C:\\Users\\vital\\IdeaProjects\\LMS_SoftServe\\src\\j_tenth_lesson\\HW10\\s_file.txt";

    public String getFileName() {
        return fileName;
    }

    public String getSecondName() {
        return secondName;
    }

    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        myCareer Me = new myCareer();
        List<String> f_file = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(Me.getFileName()));
            bw = new BufferedWriter(new FileWriter(Me.getSecondName()));
            String s = null;

            while ((s = br.readLine()) != null) {
                f_file.add(s);
            }
            bw.write("Number of Lines: " + getNumberOfLines(f_file) + "\n");
            bw.write("Longest line is: " + getLongestLine(f_file) + "\n");
            bw.write("Birthday is: " + getB(f_file) + "\n");

            bw.close();
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int getNumberOfLines(List<String> f_file) {
        return f_file.size();
    }

    public static String getLongestLine(List<String> f_file) {

        Iterator<String> it = f_file.iterator();
        String longest = " ";
        String s;
        while (it.hasNext()) {
            s = it.next();
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        return longest;
    }

    public static String getB(List<String> f_file) throws IOException {
        Pattern p = Pattern.compile("[0-9]{2}\\.[0-9]{2}\\.[0-9]{4}");
        Matcher m;

        List<String> l = new ArrayList<>();
        Iterator<String> it = f_file.iterator();

        String s;

        while (it.hasNext()) {
            s = it.next();
            String[] arr = new String[s.length()];
            arr = s.split(" ");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
                m = p.matcher(arr[i]);
                if (m.matches()) {
                    return arr[i];
                }

            }
        }
        return "";
    }
}

/*4/   Create file1.txt file with a text about your career.
Read context from file into array of strings. Each array item contains one line from file.
Write in to the file2.txt
   1) number of lines in file1.txt.
   2) the longest line in file1.txt.
   3) your name and birthday date.*/