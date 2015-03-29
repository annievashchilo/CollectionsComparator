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
		
		int size = 100000;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		HashSet<Integer> hashSet = new HashSet<Integer>();
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		TreeMap<Integer,Integer> treeMap = new TreeMap<Integer,Integer>();

		System.out.println("Measure time of insert to collections");
		CollectionsChecker.measureInsertTime(list, size);
		CollectionsChecker.measureInsertTime(linkedList, size);
		CollectionsChecker.measureInsertTime(hashSet, size);
		CollectionsChecker.measureInsertTime(treeSet, size);
		CollectionsChecker.measureInsertTime(hashMap, size); 
		CollectionsChecker.measureInsertTime(treeMap, size); 
		
		CollectionsChecker.fillCollection(list, size);
		CollectionsChecker.fillCollection(linkedList, size);
		CollectionsChecker.fillCollection(hashSet, size);
		CollectionsChecker.fillCollection(treeSet, size);
		CollectionsChecker.fillMap(hashMap, size);
		CollectionsChecker.fillMap(treeMap, size);
		
		System.out.println("\nMeasure search time through collections");
		CollectionsChecker.measureSearchTime(list, 20);
		CollectionsChecker.measureSearchTime(linkedList, 30435);
		CollectionsChecker.measureSearchTime(hashSet, 42);
		CollectionsChecker.measureSearchTime(treeSet, 0);
		CollectionsChecker.measureSearchTime(hashMap, 100);
		CollectionsChecker.measureSearchTime(treeMap, 500);
		
		System.out.println("\nMeasure time of delete element from collections");
		CollectionsChecker.measureDeleteTime(list, 100000);
		CollectionsChecker.measureDeleteTime(linkedList, 020);
		CollectionsChecker.measureDeleteTime(hashSet, 30000);
		CollectionsChecker.measureDeleteTime(treeSet, 0);
		CollectionsChecker.measureDeleteTime(hashMap, 30);
		CollectionsChecker.measureDeleteTime(treeMap, 14);
		

	}
	
}
