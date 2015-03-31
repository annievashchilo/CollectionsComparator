package cdp.automation.runner;

import cdp.automation.utils.CollectionsChecker;
import cdp.automation.utils.Utils;

import java.util.*;

public class Runner {

    private int size = 50000;
    private float time;
    private ArrayList<Integer> list;
    private LinkedList<Integer> linkedList;

    private HashSet<Integer> hashSet;
    private TreeSet<Integer> treeSet;

    private HashMap<Integer, Integer> hashMap;
    private TreeMap<Integer, Integer> treeMap;

    private Utils utils;

    public Runner() {
        list = new ArrayList<Integer>();
        linkedList = new LinkedList<Integer>();
        hashSet = new HashSet<Integer>();
        treeSet = new TreeSet<Integer>();
        hashMap = new HashMap<Integer, Integer>();
        treeMap = new TreeMap<Integer, Integer>();
        utils = new Utils();
    }

    public void handleInsertOperation() {
        HashMap<String, Float> map = new HashMap<String, Float>();

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
    }

    public void handleSearchOperation() {
        HashMap<String, Float> map = new HashMap<String, Float>();

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
    }

    public void handleDeleteOperation() {
        HashMap<String, Float> map = new HashMap<String, Float>();

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


    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.handleInsertOperation();
        runner.handleSearchOperation();
        runner.handleDeleteOperation();




    }
}
