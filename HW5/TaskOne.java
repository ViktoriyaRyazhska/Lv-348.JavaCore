import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskOne {
	
	private int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private String needMonth;
	
	public void getMonthNum() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("������ ����� ����� ��� �������� ������� ��� � �����:");
		needMonth = br.readLine();
		
		switch(needMonth.toLowerCase()) {
		case "�����":
			System.out.println("� ����� �����: " + monthDay[0] + " ����");
			break;
		case "�����":
			System.out.println("� ����� �����: " + monthDay[1] + " ���");
			break;
		case "��������":
			System.out.println("� ����� �����: " + monthDay[2] + " ����");
			break;
		case "������":
			System.out.println("� ����� �����: " + monthDay[3] + " ���");
			break;
		case "�������":
			System.out.println("� ����� �����: " + monthDay[4] + " ����");
			break;
		case "�������":
			System.out.println("� ����� �����: " + monthDay[5] + " ���");
			break;
		case "������":
			System.out.println("� ����� �����: " + monthDay[6] + " ����");
			break;
		case "�������":
			System.out.println("� ����� �����: " + monthDay[7] + " ����");
			break;
		case "��������":
			System.out.println("� ����� �����: " + monthDay[8] + " ���");
			break;
		case "�������":
			System.out.println("� ����� �����: " + monthDay[9] + " ����");
			break;
		case "��������":
			System.out.println("� ����� �����: " + monthDay[10] + " ���");
			break;
		case "�������":
			System.out.println("� ����� �����: " + monthDay[11] + " ����");
			break;
		default:
			System.out.println("������ ����� �� ����!");
			break;
		}
		
		
	}

}
