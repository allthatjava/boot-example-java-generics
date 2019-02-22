package brian.boot.example.java.generics.example1;

/**
 * Class level Generics - Any type can be used
 *
 * @param <T>
 */
public class FruitBox<T> {
	
	private T fruit;
	
	public void put(T t) {
		fruit = t;
	}

	public String whatIsIt()
	{
		return "It is a "+fruit;
	}
	
}
