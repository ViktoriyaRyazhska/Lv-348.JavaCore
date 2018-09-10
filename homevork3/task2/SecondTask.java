import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SecondTask {
public static void main(String[] args) {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	Dog Flyffy = new Dog();
	Dog Spike = new Dog();
	Dog Lucky = new Dog();
	Lucky.SetDog(reader);
	Spike.SetDog(reader);
	Flyffy.SetDog(reader);
	Spike.SameName(Flyffy, Spike, Lucky);
	Spike.OldestOne(Flyffy, Spike, Lucky);
}
}
