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
		
		int size = 50000;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		HashSet<Integer> hashSet = new HashSet<Integer>();
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
		TreeMap<Integer,Integer> treeMap = new TreeMap<Integer, Integer>();

		System.out.println("[ Measure time of insert to collections ]");
		CollectionsChecker.measureInsertTime(list, size);
		CollectionsChecker.measureInsertTime(linkedList, size);
		CollectionsChecker.measureInsertTime(hashSet, size);
		CollectionsChecker.measureInsertTime(treeSet, size);
		CollectionsChecker.measureInsertTime(hashMap, size); 
		CollectionsChecker.measureInsertTime(treeMap, size); 
				
		System.out.println("\n[ Measure search time through collections ]");
		CollectionsChecker.measureSearchTime(list);
		CollectionsChecker.measureSearchTime(linkedList);
		CollectionsChecker.measureSearchTime(hashSet);
		CollectionsChecker.measureSearchTime(treeSet);
		CollectionsChecker.measureSearchTime(hashMap);
		CollectionsChecker.measureSearchTime(treeMap);
		
		System.out.println("\n[ Measure time of delete element from collections ]");
		CollectionsChecker.measureDeleteTime(list);
		CollectionsChecker.measureDeleteTime(linkedList);
		CollectionsChecker.measureDeleteTime(hashSet);
		CollectionsChecker.measureDeleteTime(treeSet);
		CollectionsChecker.measureDeleteTime(hashMap);
		CollectionsChecker.measureDeleteTime(treeMap);
	}
}
