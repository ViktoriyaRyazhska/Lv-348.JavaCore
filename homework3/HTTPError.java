import java.util.Scanner;

public enum HTTPError {
	
	Bad_Request("400 Bad Request Error"),
	Unauthorized_Error("401 Unauthorized_Error"),
	Payment_Required("402 Payment Required"),
	Forbidden("403 Forbidden"),
	Not_Found("404 Not_Found");
	
	static public Scanner input = new Scanner(System.in);
	
	private String error;
	
	HTTPError(String error) {
		this.error = error;
	}
	
	public String getError() {
		return this.error;
	}
	
	public void setError(String error) {
		this.error = error;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number of an error");
		int num = input.nextInt();
		
		switch (num) {
		case 400:
			System.out.println(HTTPError.Bad_Request);
			break;
		case 401:
			System.out.println(HTTPError.Unauthorized_Error.error);
		case 402:
			System.out.println(HTTPError.Payment_Required.error);
		case 403:
			System.out.println(HTTPError.Forbidden.error);
		case 404:
			System.out.println(HTTPError.Not_Found.error);
		}
	}
	
}
