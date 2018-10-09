import java.math.BigInteger;

public class Task13 implements Execute{

	public void checkNumber() {
		
		
		 BigInteger res = BigInteger.ONE;
		 
		 int n = 20;

		    for(int i = 1; i <= n; i++)

		    {

		      BigInteger x = BigInteger.valueOf(i);

		      res = res.multiply(x).divide(res.gcd(x));

		            // res = res * x / gcd(res,x)

		    }

		    System.out.println(res);
	}

	@Override
	public void exec() {
		checkNumber();
	}


}
