package cdp.automation.utils;

import java.util.Collection;
import java.util.Map;

public class CollectionsChecker {
	
	/**
	 * Measure time taken on insert to the specified collection 
	 * @param c
	 * @param size of collection
	 * @return 
	 */
	public static void measureInsertTime(Collection c, int size) {
		c.clear();
		long startTime = System.currentTimeMillis();
		for (Integer i = 0; i < size; ++i) {
			c.add(i);
		}
		long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;
		
		System.out.printf("Time spent to measure insert to %s of size %s == %s senconds\n",
				c.getClass().toString(), c.size(), elapsedTime);
	}
	
	/**
	 * Measure time taken on insert to the specified collection (Maps)
	 * @param c collection
	 * @param size of collection
	 */
    public static void measureInsertTime(Map collection, int size) {
    	long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; ++i) {
            collection.put(i, i * i);
        }
        long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;
		
		System.out.printf("Time spent to measure insert to %s of size %s == %s senconds\n",
				collection.getClass().toString(), collection.size(), elapsedTime);
    }
	
    /**
     * special method to fill collections
     * @param c
     * @param size
     * @return
     */
    public static Collection fillCollection(Collection c, int size) {
		c.clear();
		for (Integer i = 0; i < size; ++i) {
			c.add(i);
		}
		return c;
	}
    
    /**
     * special method to fill the map
     * @param c – 
     * @param size
     * @return
     */
    public static Map fillMap(Map c, int size) {
    	c.clear();
    	for (int i = 0; i < size; ++i) {
            c.put(i, i * i);
        }
    	return c;
    }

	
	/**
	 * Measure time taken on remove the specified element from collection
	 * @param c
	 * @param removeElement
	 */
	public static void measureDeleteTime(Collection c, int removeElement) {
		long startTime = System.currentTimeMillis();
		
		boolean result = c.remove(removeElement);
		
		System.out.printf("The element %s was %sremoved from %s\n",
				removeElement, result ? "" : "not ", c.getClass());
		
		long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;

		System.out.printf("Time spent to measure delete from %s of size %s == %s senconds\n",
				c.getClass().toString(), c.size(), elapsedTime);
	}
	
	/**
	 * Measure time taken on remove the specified element from collection
	 * @param c
	 * @param removeElement
	 */
	public static void measureDeleteTime(Map c, int removeElement) {
		long startTime = System.currentTimeMillis();
		
		boolean result = c.keySet().remove(removeElement);
		
		System.out.printf("The element %s was %sremoved from %s\n",
				removeElement, result ? "" : "not ", c.getClass());
		
		long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;

		System.out.printf("Time spent to measure delete from %s of size %s == %s senconds\n",
				c.getClass().toString(), c.size(), elapsedTime);
	}
	
	/**
	 * Measure time taken on search for the specified element in collection
	 * @param c
	 * @param i – element to find
	 */
	public static void measureSearchTime(Collection c, Integer i) {
		long startTime = System.currentTimeMillis();
		
		System.out.println("Collection contains "+ i + "? " + c.contains(i));
		
		long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;
		System.out.printf("Time spent to measure search from %s of size %s == %s senconds\n",
				c.getClass().toString(), c.size(), elapsedTime);
	}
	
	/**
	 * Measure time taken on search for the specified element in collection
	 * @param c
	 * @param i
	 */
	public static void measureSearchTime(Map c, Integer i) {
		long startTime = System.currentTimeMillis();
		
		System.out.println("Collection contains "+ i + "? " + c.containsKey(i));
		
		long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;
		System.out.printf("Time spent to measure search from %s of size %s == %s senconds\n",
				c.getClass().toString(), c.size(), elapsedTime);
	}

}
