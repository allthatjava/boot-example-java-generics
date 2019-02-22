package brian.boot.example.java.generics.example4;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Method Level Generic test with Wildcard.
 *
 */
public class FruitBox4Test {

	/**
	 * Upper Bounded Wildcard : With the symbol ?, it can pass any sub class of the specified class
	 * 
	 * In this case, Apple4 and Banana4 are sub class of Fruit4.
	 * So, those types can be used as the parameter
	 */
	@Test
	public void testGenericMethod_withAll_shouldReturnCorrectValues() {
		
		FruitBox4 box = new FruitBox4();
		List<Apple4> appleList = new ArrayList<>();
		appleList.add(new Apple4("Apple One"));
		appleList.add(new Apple4("Apple Two"));
		box.setList(appleList);		
		
		assertThat(box.getNames()).contains("Apple One", "Apple Two");
		
		List<Banana4> bananaList = new ArrayList<>();
		bananaList.add(new Banana4("Banana One"));
		bananaList.add(new Banana4("Banana Two"));
		box.setList(bananaList);
		
		assertThat(box.getNames()).contains("Banana One", "Banana Two");
	}
	
	/**
	 * Unbounded Wildcard : It is useful when the method doesn't depends on type parameter
	 * 
	 * In this case, countGenericFruits() only uses List class method size() that doesn't
	 * care about the parameter type.
	 */
	@Test
	public void testUnboundedWildCard_withRandomText_shouldReturnCount() {
		FruitBox4 box = new FruitBox4();
		List<Apple4> appleList = new ArrayList<>();
		appleList.add(new Apple4("Apple One"));
		appleList.add(new Apple4("Apple Two"));
		box.setGenericList(appleList);
		
		assertThat(box.countGenericFruits()).isEqualTo(2);
	}

}
