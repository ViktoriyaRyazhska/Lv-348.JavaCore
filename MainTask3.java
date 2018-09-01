package fisrt_lesson.third_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTask3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        String fCountry;
        String sCountry;
        String tCountry;
        float unitsPerMinute;
        float fTime;
        float sTime;
        float tTime;

        System.out.print("Please enter units per minute: ");
        unitsPerMinute = Float.parseFloat(br.readLine());

        System.out.print("First country: ");
        fCountry = br.readLine();
        System.out.print("How much talk first person?: ");
        fTime = Float.parseFloat(br.readLine());

        System.out.print("Second country: ");
        sCountry = br.readLine();
        System.out.print("How much talk second person?: ");
        sTime = Float.parseFloat(br.readLine());

        System.out.print("Third country: ");
        tCountry = br.readLine();
        System.out.print("How much talk third person?: ");
        tTime = Float.parseFloat(br.readLine());

        float f_result = fTime * unitsPerMinute;
        float s_result = sTime * unitsPerMinute;
        float t_result = tTime * unitsPerMinute;
        float generalResult = f_result + s_result + t_result;

        System.out.println("Count for first call in: " + fCountry + " is " + f_result + ";");
        System.out.println("Count for second call: " + sCountry + " is " + s_result + ";");
        System.out.println("Count for third call: " + tCountry + " is "+ t_result + ";");
        System.out.println("Count for all calls together: " + generalResult + ";");
    }

}
