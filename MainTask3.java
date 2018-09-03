package fisrt_lesson.third_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTask3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        float c1;
        float c2;
        float c3;
        float fTime;
        float sTime;
        float tTime;

        System.out.print("Please enter units per minute for first country: ");
        c1 = Float.parseFloat(br.readLine());
        System.out.print("How much talk first person?: ");
        fTime = Float.parseFloat(br.readLine());

        System.out.print("Please enter units per minute for second country: ");
        c2 = Float.parseFloat(br.readLine());
        System.out.print("How much talk second person?: ");
        sTime = Float.parseFloat(br.readLine());

        System.out.print("Please enter units per minute for third country: ");
        c3 = Float.parseFloat(br.readLine());
        System.out.print("How much talk third person?: ");
        tTime = Float.parseFloat(br.readLine());

        float f_result = fTime * c1;
        float s_result = sTime * c2;
        float t_result = tTime * c3;
        float generalResult = f_result + s_result + t_result;

        System.out.println("Count for first call in is: " + f_result + ";");
        System.out.println("Count for second call is: " + s_result + ";");
        System.out.println("Count for third call is: "+ t_result + ";");
        System.out.println("Count for all calls together: " + generalResult + ";");
    }

}
