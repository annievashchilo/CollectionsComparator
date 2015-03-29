package cdp.automation.utils;

import java.util.Collection;
import java.util.Map;
import java.util.List;
import java.util.HashMap;

public class CollectionsChecker {

    /**
     * special method to fill collections
     * @param c
     * @param size
     * @return
     */
    public static void fillCollection(Collection c, int size, boolean needClean) {
    	if (needClean) c.clear();
		for (Integer i = 0; i < size; ++i) {
			c.add(i);
		}
	}
    
    /**
     * special method to fill the map
     * @param c – 
     * @param size
     * @return
     */
    public static void fillCollection(Map c, int size, boolean needClean) {
    	if (needClean) c.clear();
    	for (int i = 0; i < size; ++i) {
            c.put(i, i);
        }
    }	

	/**
	 * Measure time taken on insert to the specified collection 
	 * @param c
	 * @param size of collection
	 * @return 
	 */
	public static void measureInsertTime(Collection c, int size) {
		long startTime = System.currentTimeMillis();
		fillCollection(c, size, false);
		float elapsedTime = (System.currentTimeMillis() - startTime);
		
		System.out.printf(
				"\t%s insert: %.2f ms; %.2f us per element\n",
				c.getClass().getSimpleName(), elapsedTime, 1000.0 * elapsedTime / size);
	}

	/**
	 * Measure time taken on insert to the specified collection (Maps)
	 * @param c collection
	 * @param size of collection
	 */
    public static void measureInsertTime(Map c, int size) {
    	long startTime = System.currentTimeMillis();
        fillCollection(c, size, false);
        float elapsedTime = (System.currentTimeMillis() - startTime);

        System.out.printf(
				"\t%s insert: %.2f ms; %.2f us per element\n",
				c.getClass().getSimpleName(), elapsedTime, 1000.0 * elapsedTime / size);
    }
	
	/**
	 * Measure time taken on remove the specified element from collection
	 * @param c
	 * @param removeElement
	 */
	public static void measureDeleteTime(Collection c) {
		int size = c.size();
		
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < size; ++i) {
			c.remove(i);
		}
		float elapsedTime = (System.currentTimeMillis() - startTime);

		System.out.printf(
				"\t%s remove: %.2f ms; %.2f us per element\n",
				c.getClass().getSimpleName(), elapsedTime, 1000.0 * elapsedTime / size);
	}
	
	/**
	 * Measure time taken on remove the specified element from collection
	 * @param c
	 * @param removeElement
	 */
	public static void measureDeleteTime(Map c) {
		int size = c.size();
		
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < size; ++i) {
			c.remove(i);
		}
		float elapsedTime = (System.currentTimeMillis() - startTime);

		System.out.printf(
				"\t%s remove: %.2f ms; %.2f us per element\n",
				c.getClass().getSimpleName(), elapsedTime, 1000.0 * elapsedTime / size);
	}
	
	/**
	 * Measure time taken on search for the specified element in collection
	 * @param c
	 * @param i – element to find
	 */
	public static void measureSearchTime(Collection c) {
		int size = c.size();
		
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < size; ++i) {
			c.contains(-1);
		}
		float elapsedTime = (System.currentTimeMillis() - startTime);

		System.out.printf(
				"\t%s search: %.2f ms; %.2f us per element\n",
				c.getClass().getSimpleName(), elapsedTime, 1000.0 * elapsedTime / size);
	}
	
	/**
	 * Measure time taken on search for the specified element in collection
	 * @param c
	 * @param i
	 */
	public static void measureSearchTime(Map c) {
		int size = c.size();
		
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < size; ++i) {
			c.containsKey(-1);
		}
		float elapsedTime = (System.currentTimeMillis() - startTime);
		
		System.out.printf(
				"\t%s search: %.2f ms; %.2f us per element\n",
				c.getClass().getSimpleName(), elapsedTime, 1000.0 * elapsedTime / size);
	}
}
