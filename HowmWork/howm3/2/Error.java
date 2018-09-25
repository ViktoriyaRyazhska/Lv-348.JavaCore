import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Error {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		{

			System.out.println("Please, input any error number which belong to the range[400,404]:");
			int errorNumber1 = Integer.parseInt(br.readLine());

			HTTPError error = null;

			switch (errorNumber1) {
			case 400:
				error = HTTPError.BAD_REQUEST;
				break;
			case 401:
				error = HTTPError.UNAUTHORIZED;
				break;
			case 402:
				error = HTTPError.PAYMENT_REQUIRED;
				break;
			case 403:
				error = HTTPError.FORBIDDEN;
				break;
			case 404:
				error = HTTPError.NOT_FOUND;
				break;
			default:
				System.out.println("Unknown error! Please, try one more time.");
				break;
			}
			System.out.println("HTTP Error: " + error + ".");
		}

	}

}