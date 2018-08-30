
import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;


public class CallCalculator {
	
	String c1;
	String c2;
	String c3;
	float t1;
	float t2;
	float t3;
    static float price = 6.3f;
	  public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Тариф на сьогоднішній день: " + price + "$" );
	System.out.println("Введіть 1 країну з якої надійшов дзвінок : ");
	String c1 = br.readLine();
	System.out.println("Введіть тривальсть дзвінка у хвилинах з " + c1);
	float t1 = Float.parseFloat(br.readLine());
	
	System.out.println("Введіть 2 країну з якої надійшов дзвінок : ");
	String c2 = br.readLine();
	System.out.println("Введіть тривальсть дзвінка у хвилинах з " + c2);
	float t2 = Float.parseFloat(br.readLine());
	
	System.out.println("Введіть 3 країну з якої надійшов дзвінок : ");
	String c3 = br.readLine();
	System.out.println("Введіть тривальсть дзвінка у хвилинах з " + c3);
	float t3 = Float.parseFloat(br.readLine());

	System.out.println("Країна:  " + c1 + ". Вартість двінка становить: " + (price*t1) + "$" );  
	System.out.println("Країна:  " + c2 + ". Вартість двінка становить: " + (price*t2)  + "$");  
	System.out.println("Країна:  " + c3 + ". Вартість двінка становить: " + (price*t3)  + "$");  
	
	System.out.println("Країни :  " + c1+ ", " + c2 + ", " + c3+ ". " + "Загальна вартість становить: " + ((price*t1)+(price*t2)+(price*t3)) + "$" );  

	  }
	  }
