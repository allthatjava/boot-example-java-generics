package brian.boot.example.java.generics.example4;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Java Generic - Wild card 
 *
 * @param <T>
 */
public class FruitBox4 {
	
	List<? extends Fruit4> fruitList;
	List<?> genericFruitList;
	
	/**
	 * Any subclass of Fruit4 can be used in '?'
	 * @param fruitList
	 */
	public void setList(List<? extends Fruit4> fruitList)
	{
		this.fruitList = fruitList;
	}
	
	public String getNames()
	{
		return fruitList.stream()
		.map( Fruit4::getName )
		.collect( Collectors.joining(", ") );
	}
	
	public void setGenericList(List<?> genericFruitList)
	{
		this.genericFruitList = genericFruitList;
	}
	
	public int countGenericFruits()
	{
		return genericFruitList.size();
	}
	
}
