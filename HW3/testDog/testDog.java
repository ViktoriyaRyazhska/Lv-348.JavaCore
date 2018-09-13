import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Dog.Breed;

class testDog {

	@Test
	void test() {
		Dog dog = new Dog("Andrew", Dog.Breed.PUG, 15);
		String expected = "Andrew";
		assertEquals(expected, dog);
	}

}
