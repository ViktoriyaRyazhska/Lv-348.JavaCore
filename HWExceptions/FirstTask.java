import java.io.IOException;

public class FirstTask {

	static double div(double a, double b) throws ArithmeticException, IOException {
		if(a < 0 || b < 0) {
			throw new ArithmeticException("No!");
		} else {
		return a/b;
		}
	}
	
}
