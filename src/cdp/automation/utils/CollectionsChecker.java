package cdp.automation.utils;

import java.util.Collection;
import java.util.Collections;

public class CollectionsChecker {
	
	public Collection fillCollection(Collection c, int size) {
		for (Integer i = 0; i <= size; i++) {
			c.add(i);
		}
		return c;
	}
	
	public void measureInsertTime(Collection c, int size)
	{
		long startTime = System.currentTimeMillis();
		fillCollection(c, size);
		long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;
		
		System.out.printf("Time spent to measure insert to %s of size %s == %s senconds\n",
				c.getClass().toString(), c.size(), elapsedTime);
	}
	
	public void measureDelete(Collection c) {
		long startTime = System.currentTimeMillis();
		
		for (Integer i = 0; i <= c.size(); i++) {
			c.remove(i);
		}
		
		long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;

		System.out.printf("Time spent to measure delete from %s of size %s == %s senconds\n",
				c.getClass().toString(), c.size(), elapsedTime);
	}
	
	public void measureFindElement(Collection c, Object o) {
		long startTime = System.currentTimeMillis();
		if (!c.contains(c)) {
			System.out.println("Element not found");
			return;
		}
		long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;
		System.out.printf("Time spent to measure search from %s of size %s == %s senconds\n",
				c.getClass().toString(), c.size(), elapsedTime);
		
		
	}

}
