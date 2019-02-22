package brian.boot.example.java.generics.example2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import brian.boot.example.java.generics.example2.Apple2;
import brian.boot.example.java.generics.example2.Banana2;
import brian.boot.example.java.generics.example2.FruitBox2;

/**
 * Java Generic "Bounded Type" test. 
 *
 */
public class FruitBox2Test {

	/**
	 * Java Generic Bounded Type : This will restrict to use only sub classes of the
	 * given Class type.
	 * 
	 * In this case, 
	 * FruitBox2<T extends Fruit2> was defined. So, only Apple2 and Banana2 can be used
	 * that are sub class of Fruit2. Tomato2 is not.
	 * 
	 */
	@Test
	public void testBoundedType_withAppleAndBanana_shouldReturnCorrectValues() {
		FruitBox2<Apple2> appleBox = new FruitBox2<>();
		appleBox.put(new Apple2());
		
		assertThat(appleBox.whatIsIt()).isEqualTo("It is a Apple2");
		
		FruitBox2<Banana2> bananaBox = new FruitBox2<>();
		bananaBox.put(new Banana2());

		assertThat(bananaBox.whatIsIt()).isEqualTo("It is a Banana2");

		/*
			Compile error for the following lines.
			Tomato cannot be used because <T extends Fruit> excludes 
			anything that is not Fruit interface's sub classes
		*/
//		Tomato2 tomato = new Tomato2();
//		FruitBox<Tomato2> tomatoBox = new FruitBox<>();
	}
}
