
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

	System.out.println("����� �� ���������� ����: " + price + "$" );
	System.out.println("������ 1 ����� � ��� ������� ������ : ");
	String c1 = br.readLine();
	System.out.println("������ ���������� ������ � �������� � " + c1);
	float t1 = Float.parseFloat(br.readLine());
	
	System.out.println("������ 2 ����� � ��� ������� ������ : ");
	String c2 = br.readLine();
	System.out.println("������ ���������� ������ � �������� � " + c2);
	float t2 = Float.parseFloat(br.readLine());
	
	System.out.println("������ 3 ����� � ��� ������� ������ : ");
	String c3 = br.readLine();
	System.out.println("������ ���������� ������ � �������� � " + c3);
	float t3 = Float.parseFloat(br.readLine());

	System.out.println("�����:  " + c1 + ". ������� ����� ���������: " + (price*t1) + "$" );  
	System.out.println("�����:  " + c2 + ". ������� ����� ���������: " + (price*t2)  + "$");  
	System.out.println("�����:  " + c3 + ". ������� ����� ���������: " + (price*t3)  + "$");  
	
	System.out.println("����� :  " + c1+ ", " + c2 + ", " + c3+ ". " + "�������� ������� ���������: " + ((price*t1)+(price*t2)+(price*t3)) + "$" );  

	  }
	  }
