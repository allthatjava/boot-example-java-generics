package brian.example.boot.java.generics.example3;

/**
 * Any type can be used
 *
 * @param <T>
 */
public class FruitBox3 {
	
	public <T> String whatIsIt(T fruit)
	{
		return "It is a "+fruit;
	}
	
	public <T extends Fruit3> String getName(T fruit)
	{
		return fruit.toString();
	}
	
}
