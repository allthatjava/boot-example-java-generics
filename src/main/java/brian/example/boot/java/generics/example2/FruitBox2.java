package brian.example.boot.java.generics.example2;

/**
 * Class level Generics - This class uses bounded type. Only type that implements Fruit2 can be used.
 *
 * @param <T>
 */
public class FruitBox2<T extends Fruit2> {
	
	private T fruit;
	
	public void put(T t) {
		fruit = t;
	}

	public String whatIsIt()
	{
		return "It is a "+fruit;
	}
	
}
