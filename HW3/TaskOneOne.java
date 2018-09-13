import java.util.Scanner;

public class TaskOneOne {
	
	private int errorNumber;
	
	enum HTTPErrors {
		BAD_REQUEST("400 Bad Request"),
		UNAUTHORIZED("401 Unauthorized"),
		PAYMENT_REQUIRED("402 Payment Required"),
		FORBIDDEN("403 Forbidden"),
		NOT_FOUND("404 Not Found");
		
		String name;
		HTTPErrors(String name) {
			this.name =name;
		}
	}
	
	public void getErrorName() {
		
		System.out.println("Input error number:");
		Scanner sc = new Scanner(System.in);
		errorNumber = sc.nextInt();
		
		switch(errorNumber) {
		case 400:
			System.out.println(HTTPErrors.BAD_REQUEST.name);
			break;
		case 401:
			System.out.println(HTTPErrors.UNAUTHORIZED.name);
			break;
		case 402:
			System.out.println(HTTPErrors.PAYMENT_REQUIRED.name);
			break;
		case 403:
			System.out.println(HTTPErrors.FORBIDDEN.name);
			break;
		case 404:
			System.out.println(HTTPErrors.NOT_FOUND.name);
			break;
		default:
			System.out.println("Unknown error!");
			break;
		}
		
	}
	
}
