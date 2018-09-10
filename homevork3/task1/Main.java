import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		FirstTask nain = new FirstTask();
		nain.NumbersFloat(reader);
		nain.NumbersInt(reader);
		nain.HTTPError(reader);
	}
}
