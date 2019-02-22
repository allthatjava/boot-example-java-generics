package brian.boot.example.java.generics.example3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * Method Level Generic test 
 *
 */
public class FruitBox3Test {

	/**
	 * Method Level Generic Type : You can use the Generics on Method level 
	 * 								without using Stress Type <> on the Class level
	 */
	@Test
	public void testGenericMethod_withAll_shouldReturnCorrectValues() {
		
		FruitBox3 box = new FruitBox3();
		assertThat(box.whatIsIt(new Apple3())).isEqualTo("It is a Apple3");
		assertThat(box.whatIsIt(new Banana3())).isEqualTo("It is a Banana3");
		assertThat(box.whatIsIt(new Tomato3())).isEqualTo("It is a Tomato3");
	}

	/**
	 * Method Level Generic "Bounded Type" : Same as the class level, it can restrict
	 *  the type developers can use with < T extends Something >
	 */
	@Test
	public void testBoundedTypeMethod_withSubClassOfFruit_shouldReturnCorrectValues() {
		
		FruitBox3 box = new FruitBox3();
		assertThat(box.getName(new Apple3())).isEqualTo("Apple3");
		
	}
}
