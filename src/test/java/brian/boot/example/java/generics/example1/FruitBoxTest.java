package brian.boot.example.java.generics.example1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import brian.boot.example.java.generics.example1.Apple;
import brian.boot.example.java.generics.example1.Banana;
import brian.boot.example.java.generics.example1.FruitBox;

/**
 * Java Generic Type test.
 *
 */
public class FruitBoxTest {

	/**
	 * Unbounded Type : Any type can be pass to FruitBox<T>.
	 * 
	 * This would be useful when the parameter is used and it is not depending on
	 * parameter class' feature.
	 * 
	 *  In this case, Object class method 'toString()' was used in FruitBox.whatIsIt() method.
	 */
	@Test
	public void testGenericType_withAppleAndBanana_shouldReturnCorrectValue() {
		FruitBox<Apple> appleBox = new FruitBox<>();
		appleBox.put( new Apple() );
		
		assertThat(appleBox.whatIsIt()).isEqualTo("It is a Apple");
		
		FruitBox<Banana> bananaBox = new FruitBox<>();
		bananaBox.put(new Banana());

		assertThat(bananaBox.whatIsIt()).isEqualTo("It is a Banana");
	}
}
