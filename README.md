# boot-example-java-generics
Example of Java Generics

### Class Level Generics
Please see the test cases in src/test/java.
There are two test classes FruitBoxTest.java & FruitBox2Test.java

* Unbounded type

```
public class FruitBox<T> {
    
    private T fruit;
    
    public void put(T t) {
        fruit = t;
    }
...
}
```

* Bounded Type

```
public class FruitBox2<T extends Fruit2> {
    
    private T fruit;
    
    public void put(T t) {
        fruit = t;
    }
...   
}
```

### Method Level Generics
There are two test classes FruitBox3Test.java

* Unbounded Type

```
public class FruitBox3 {
    
    public <T> String whatIsIt(T fruit)
    {
        return "It is a "+fruit;
    }
...
}
```

* Bounded Type

```
public class FruitBox3 {
    
...
    public <T extends Fruit3> String getName(T fruit)
    {
        return fruit.toString();
    }
    
}
````

### Wildcard
There is a test classes for Wildcard Type : FruitBox3Test.java

```
public class FruitBox4 {
    
    List<? extends Fruit4> fruitList;
    List<?> genericFruitList;
    
    public void setList(List<? extends Fruit4> fruitList)
    {
        this.fruitList = fruitList;
    }
...    
    public void setGenericList(List<?> genericFruitList)
    {
        this.genericFruitList = genericFruitList;
    }
...
```