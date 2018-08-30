package soft.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Phones {
	
	public static void main(String[] args) throws IOException {
		int c1;
		int c2;
		int c3;
		int t1;
		int t2;
		int t3;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Введіть вартість дзвінка за хвилину з країни 1:");
		c1 = Integer.parseInt(br.readLine());
		System.out.println("Введіть вартість дзвінка за хвилину з країни 2:");
		c2 = Integer.parseInt(br.readLine());
		System.out.println("Введіть вартість дзвінка за хвилину з країни 3:");
		c3 = Integer.parseInt(br.readLine());
		System.out.printf("Варість дзвінка за хвилину з країни 1: %d $, з країни 2: %d $, з країни 3: %d $\n", c1, c2, c3);
		
		System.out.println("Введіть тривалість першого дзвінка:");
		t1 = Integer.parseInt(br.readLine());
		System.out.println("Введіть тривалість другого дзвінка:");
		t2 = Integer.parseInt(br.readLine());
		System.out.println("Введіть тривалість третього дзвінка:");
		t3 = Integer.parseInt(br.readLine());
		System.out.printf("Тривалість дзвінка з країни 1: %d хв, з країни 2: %d хв, з країни 3: %d хв\n", t1, t2, t3);
		
		int f1 = c1*t1;
		int f2 = c2*t2;
		int f3 = c3*t3;
		System.out.printf("Варість розмови з країни 1: %d $, з країни 2: %d $, з країни 3: %d $\n", f1, f2, f3);
		
		int fsum = f1+f2+f3;
		System.out.println("Загальна вартість дзвінків:" + " " + fsum + "$");
	}
	
}
