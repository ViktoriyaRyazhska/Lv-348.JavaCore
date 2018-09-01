package fisrt_lesson.first_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class MainTask1 {

    public static void main(String[] args) throws IOException {

        System.out.print("Please enter radius: ");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        double radius = Double.parseDouble(br.readLine());
        double Perimeter = Math.PI * 2 * radius;
        double Area = Math.PI * Math.pow(radius, 2);

        //System.out.printf("%5.2f", Perimeter);
        System.out.println("Perimeter = " + String.format("%.4g%n", Perimeter) + "Area = " + String.format("%.4g%n", Area));
    }
}




