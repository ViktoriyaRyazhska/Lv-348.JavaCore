import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);

		System.out.println("������ �����");
		
		
	
		String c1 = scanner.nextLine();
		String c2 = scanner.nextLine();
		String c3 = scanner.nextLine();
		
		System.out.println("������ ��� ������� �" + c1);
		int t1 = scanner.nextInt();
		System.out.println("������ ��� ������� �" + c2);
		int t2 = scanner.nextInt();
		System.out.println("������ ��� ������� � " + c3);
		int t3 = scanner.nextInt();
		System.out.println(c1 + "-" + t1 + " "  +  c2 + "-" + t2 + " " + c3 + "-" + t3);
		int t =t1+t2+t3;
		System.out.println("��������� ��� ������:" + t);
	
	}
	

}





