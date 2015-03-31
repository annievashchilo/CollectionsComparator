package cdp.automation.runner;

import cdp.automation.utils.CollectionsChecker;
import cdp.automation.utils.Utils;

import java.util.*;

public class Runner {

    public static void main(String[] args) {

        int size = 50000;

        HashMap<String, Float> map = new HashMap<String, Float>();
        Utils utils = new Utils();
        float time = 0;

        ArrayList<Integer> list = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        HashSet<Integer> hashSet = new HashSet<Integer>();
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();

        System.out.println("[ Measure time of insert to collections ]");
        time = CollectionsChecker.measureInsertTime(list, size);
        map.put(list.getClass().getSimpleName(), time);

        time = CollectionsChecker.measureInsertTime(linkedList, size);
        map.put(list.getClass().getSimpleName(), time);

        time = CollectionsChecker.measureInsertTime(hashSet, size);
        map.put(hashSet.getClass().getSimpleName(), time);

        time = CollectionsChecker.measureInsertTime(treeSet, size);
        map.put(treeSet.getClass().getSimpleName(), time);

        time = CollectionsChecker.measureInsertTime(hashMap, size);
        map.put(hashMap.getClass().getSimpleName(), time);

        time = CollectionsChecker.measureInsertTime(treeMap, size);
        map.put(treeMap.getClass().getSimpleName(), time);

        utils.sortByTime(map);

        map.clear();


        System.out.println("\n[ Measure search time through collections ]");
        time = CollectionsChecker.measureSearchTime(list);
        map.put(list.getClass().getSimpleName(), time);

        time = CollectionsChecker.measureSearchTime(linkedList);
        map.put(linkedList.getClass().getSimpleName(), time);

        time = CollectionsChecker.measureSearchTime(hashSet);
        map.put(hashSet.getClass().getSimpleName(), time);

        time = CollectionsChecker.measureSearchTime(treeSet);
        map.put(treeSet.getClass().getSimpleName(), time);

        time = CollectionsChecker.measureSearchTime(hashMap);
        map.put(hashMap.getClass().getSimpleName(), time);

        time = CollectionsChecker.measureSearchTime(treeMap);
        map.put(treeMap.getClass().getSimpleName(), time);

        utils.sortByTime(map);

        map.clear();


        System.out.println("\n[ Measure time of delete element from collections ]");
        time = CollectionsChecker.measureDeleteTime(list);
        map.put(list.getClass().getSimpleName(), time);

        time = CollectionsChecker.measureDeleteTime(linkedList);
        map.put(linkedList.getClass().getSimpleName(), time);

        time = CollectionsChecker.measureDeleteTime(hashSet);
        map.put(hashSet.getClass().getSimpleName(), time);

        time = CollectionsChecker.measureDeleteTime(treeSet);
        map.put(treeSet.getClass().getSimpleName(), time);

        time = CollectionsChecker.measureDeleteTime(hashMap);
        map.put(hashMap.getClass().getSimpleName(), time);

        time = CollectionsChecker.measureDeleteTime(treeMap);
        map.put(treeMap.getClass().getSimpleName(), time);

        utils.sortByTime(map);

        map.clear();
    }
}
