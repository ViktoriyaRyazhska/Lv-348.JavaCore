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
		
		System.out.println("������ ������� ������ �� ������� � ����� 1:");
		c1 = Integer.parseInt(br.readLine());
		System.out.println("������ ������� ������ �� ������� � ����� 2:");
		c2 = Integer.parseInt(br.readLine());
		System.out.println("������ ������� ������ �� ������� � ����� 3:");
		c3 = Integer.parseInt(br.readLine());
		System.out.printf("������ ������ �� ������� � ����� 1: %d $, � ����� 2: %d $, � ����� 3: %d $\n", c1, c2, c3);
		
		System.out.println("������ ��������� ������� ������:");
		t1 = Integer.parseInt(br.readLine());
		System.out.println("������ ��������� ������� ������:");
		t2 = Integer.parseInt(br.readLine());
		System.out.println("������ ��������� �������� ������:");
		t3 = Integer.parseInt(br.readLine());
		System.out.printf("��������� ������ � ����� 1: %d ��, � ����� 2: %d ��, � ����� 3: %d ��\n", t1, t2, t3);
		
		int f1 = c1*t1;
		int f2 = c2*t2;
		int f3 = c3*t3;
		System.out.printf("������ ������� � ����� 1: %d $, � ����� 2: %d $, � ����� 3: %d $\n", f1, f2, f3);
		
		int fsum = f1+f2+f3;
		System.out.println("�������� ������� ������:" + " " + fsum + "$");
	}
	
}
