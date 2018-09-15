package homeWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_HTTP {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please, input any error number which belong to the range[400,404]:");
		int errorNumber = Integer.parseInt(bf.readLine());

		HTTP_Error error = null;

		switch (errorNumber) {
		case 400:
			error = HTTP_Error.BAD_REQUEST;
			break;
		case 401:
			error = HTTP_Error.UNAUTHORIZED;
			break;
		case 402:
			error = HTTP_Error.PAYMENT_REQUIRED;
			break;
		case 403:
			error = HTTP_Error.FORBIDDEN;
			break;
		case 404:
			error = HTTP_Error.NOT_FOUND;
			break;
		default:
			System.out.println("Unknown error! Please, try one more time.");
			break;
		}
		System.out.println("HTTP Error: " + error + ".");
	}

}
