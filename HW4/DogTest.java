package third_lesson;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {
  @Test
    public void Dog(){
      Dog dog = new Dog("Garik",23, Dog.Breed.LABRADOR);
      String expected = "Garik";
      assertEquals(expected, dog.getName());
  }
}