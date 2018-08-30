import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
public class HomeWork1 {
	
	float radius;
	
	  public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("¬вед≥ть рад≥ус");
	float radius = Float.parseFloat(br.readLine());
	System.out.println("ѕериметр дор≥внюЇ : P = " + (2*3.14*radius));  
	System.out.println("ѕлоща дор≥≥нюЇ :  S = " + (3.14*(radius*radius)) );
	  }
	}


