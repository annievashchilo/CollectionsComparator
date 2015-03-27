package cdp.automation.runner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import cdp.automation.utils.CollectionsChecker;

public class Runner {

	public static void main(String[] args) {
		
		int size = 1000;
		
		CollectionsChecker cc = new CollectionsChecker();
		List<Integer> list = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		HashSet<Integer> hashSet = new HashSet<Integer>();
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		TreeMap<Integer,Integer> treeMap = new TreeMap<Integer,Integer>();
		
		cc.measureInsertTime(list, size);
		cc.measureInsertTime(linkedList, size);
		cc.measureInsertTime(hashSet, size);
		cc.measureInsertTime(treeSet, size);
		
		// TODO: FIX THIS!!!!!!!
//		cc.measureInsertTime(hashMap.values(), size); 
//		cc.measureInsertTime(treeMap.keySet(), size);
		
		cc.fillCollection(list, size);
		cc.fillCollection(linkedList, size);
		cc.fillCollection(hashSet, size);
		cc.fillCollection(treeSet, size);
		
		cc.measureDelete(list);
		cc.measureDelete(linkedList);
		cc.measureDelete(hashSet);
		cc.measureDelete(treeSet);
		
		
		// TODO: FIX THIS!!!!!!!
//		cc.measureFindElement(list, 20);
//		cc.measureFindElement(linkedList, 30435);
//		cc.measureFindElement(hashSet, 42);
//		cc.measureFindElement(treeSet, 0);
	}
	
}
