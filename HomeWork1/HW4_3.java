package Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW4_3 {

	private static HTTP_Error error;


	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of error");
		
		
		
		error = null;
				
		
		int error_num = Integer.parseInt(br.readLine());
		
		
		switch (error_num) {
		case 400:
			error = HTTP_Error.BAD_REQEST;
			break;
				
		case 401:
			error = HTTP_Error.Unauthorized;
			break;
			
		case 402:
			error = HTTP_Error.Payment_Required;
			break;
			
		case 403:
			error = HTTP_Error.Forbidden;
			break;
			
		case 404:
			error = HTTP_Error.Not_Found;
			break;
			
		case 405:
			error = HTTP_Error.Method_Not_Allowed;
			break;
			
		case 406:
			error = HTTP_Error.Not_Acceptable;
			break;
			
		case 407:
			error = HTTP_Error.Proxy_Authentication_Required;
			break;
			
		case 408:
			error = HTTP_Error.Request_Timeout;
			break;
			
		case 409:
			error = HTTP_Error.Conflict;
			break;
			
		case 410:
			error = HTTP_Error.Gone;
			break;
			
		default:
			System.out.println("Unknown error! Please, try leater.");
			break;
		}
		System.out.println("HTTP Error: " + error + ".");
	}
		

	public enum HTTP_Error {		
		BAD_REQEST, Unauthorized, Payment_Required, Forbidden, Not_Found, Method_Not_Allowed, Not_Acceptable,
		Proxy_Authentication_Required, Request_Timeout, Conflict, Gone, 
		}
	
	}


		
		
	


