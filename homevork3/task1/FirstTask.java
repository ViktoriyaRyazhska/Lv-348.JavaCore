import java.io.BufferedReader;
import java.io.IOException;

public class FirstTask {

	public void NumbersFloat(BufferedReader reader) {
		try {
			System.out.println("Insert any float number (First) ");
			float a = Float.parseFloat(reader.readLine());

			System.out.println("Insert any float number (Second) ");
			float b = Float.parseFloat(reader.readLine());

			System.out.println("Insert any float number (Third) ");
			float c = Float.parseFloat(reader.readLine());

			if ((a <= 5 && a >= -5) && (b <= 5 && b >= -5) && (c <= 5 && c >= -5)) {
				System.out.println("All this numbers are beetwen [-5 and 5] ");
			} else {
				System.out.println("Some or all of this numbers are  out of border [-5..5]");
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
			System.out.println("This is Exception " + e);
		}

	}

	public void NumbersInt(BufferedReader reader) {
		try {
			System.out.println("Insert any integer number (First) ");
			int a = Integer.parseInt(reader.readLine());

			System.out.println("Insert any integer number ");
			int b = Integer.parseInt(reader.readLine());

			System.out.println("Insert any integer number ");
			int c = Integer.parseInt(reader.readLine());

			System.out.println("Minimal value is: " + Math.min(a, Math.min(b, c)));
			System.out.println("Maximal value is: " + Math.max(a, Math.max(b, c)));

			/*
			 * Its working,I wrote this because the theme is conditional statements, but the
			 * solution is quite large. So I used Math class.
			 * 
			 * if((a>b)&&(a>c)) {System.out.println("Maximal value is: " + a);} else
			 * if((b>a)&&(b>c)) {System.out.println("Maximal value is: " + b);} else
			 * if((c>b)&&(c>a)) {System.out.println("Maximal value is: " + c);} else
			 * {System.out.println("Crash ");}
			 * 
			 * if((a<b)&&(a<c)) {System.out.println("Minimal value is: " + a);} else
			 * if((b<a)&&(b<c)) {System.out.println("Minimal value is: " + b);} else
			 * if((c<b)&&(c<a)) {System.out.println("Minimal value is: " + c);} else
			 * {System.out.println("Crash ");}
			 * 
			 */

		} catch (NumberFormatException | IOException e) {

			e.printStackTrace();
			System.out.println("This is Exception " + e);
		}

	}

	public void HTTPError(BufferedReader reader) {

		System.out.println("Insert number of Error:  ");
		try {
			String a = reader.readLine();
			HTTPError error;
			switch (a) {
			case "400":
				System.out.println(error = HTTPError.Bad_Request);
				break;
			case "401":
				System.out.println(error = HTTPError.Unauthorized);
				break;
			case "402":
				System.out.println(error = HTTPError.Payment_Required);
				break;
			case "403":
				System.out.println(error = HTTPError.Forbidden);
				break;
			case "404":
				System.out.println(error = HTTPError.Not_Found);
				break;
			case "405":
				System.out.println(error = HTTPError.Method_Not_Allowed);
				break;
			case "406":
				System.out.println(error = HTTPError.Not_Acceptable);
				break;
			case "407":
				System.out.println(error = HTTPError.Proxy_Authentication_Required);
				break;
			case "408":
				System.out.println(error = HTTPError.Request_Timeout);
				break;
			case "409":
				System.out.println(error = HTTPError.Conflict);
				break;
			case "410":
				System.out.println(error = HTTPError.Gone);
				break;
			case "411":
				System.out.println(error = HTTPError.Length_Required);
				break;
			case "412":
				System.out.println(error = HTTPError.Precondition_Failed);
				break;
			case "413":
				System.out.println(error = HTTPError.Request_Entity_Too_Large);
				break;
			case "414":
				System.out.println(error = HTTPError.Request_URI_Too_Long);
				break;
			case "415":
				System.out.println(error = HTTPError.Unsupported_Media_Type);
				break;
			case "416":
				System.out.println(error = HTTPError.Requested_Range_Not_Satisfiable);
				break;
			case "417":
				System.out.println(error = HTTPError.Expectation_Failed);
				break;
			case "418":
				System.out.println(error = HTTPError.Im_a_teapot);
				break;
			case "419":
				System.out.println(error = HTTPError.Authentication_Timeout);
				break;
			case "420":
				System.out.println(error = HTTPError.Method_Failure);
				break;
			case "422":
				System.out.println(error = HTTPError.Unprocessable_Entity);
				break;
			case "423":
				System.out.println(error = HTTPError.Locked);
				break;
			default:
				System.out.println("Unknown Error!");
				
				break;

			}
		} catch (IOException e) {
			System.out.println("Are you sure this is correct Error number? " + e);
			e.printStackTrace();
		}

	}

}
