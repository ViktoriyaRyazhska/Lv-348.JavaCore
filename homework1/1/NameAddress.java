
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader; 
	
public class NameAddress {
	
	String name;
	String address;
	
	  public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("�����! �� ���� �����?");
	String name = br.readLine();
	System.out.println("�� �� ��������?");
	String address = br.readLine();

	System.out.println("����, ���� �����  " + name + " � �� �������� " + address + ".");  
	  }
	}


