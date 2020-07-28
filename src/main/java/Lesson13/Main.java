package Lesson13;

import lesson10.Cat;
import lesson10.Dog;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class Main {
    public static void main(String[] args) {

        //List example
//        ArrayList arrayList = new ArrayList(100000);
//        LinkedList linkedList = new LinkedList();
//
//        arrayList.add("element1");
//        arrayList.add(2);
//        arrayList.add(3.7);
//        System.out.println(arrayList.get(0));
//
//        arrayList.add(0, "element2");
//        System.out.println(arrayList.get(0));
//
//        arrayList.set(0, "element3");
//        System.out.println(arrayList.get(0));
//
//        System.out.println(Arrays.toString(arrayList.toArray()));
//
//        System.out.println("arrayList.size(): " + arrayList.size());
//
//        System.out.println("arrayList.isEmpty(): " + arrayList.isEmpty());
//
//        System.out.println("arrayList.contains(2): " + arrayList.contains(2));
//        System.out.println("arrayList.contains(3): " + arrayList.contains(3));
//
//        arrayList.remove(3.7);
//        arrayList.remove("element777");
//        System.out.println(Arrays.toString(arrayList.toArray()));
//
//        System.out.println(Arrays.toString(linkedList.toArray()));
//        linkedList.addAll(arrayList);
//
//        System.out.println(Arrays.toString(linkedList.toArray()));
//
//        arrayList.clear();
//        System.out.println(Arrays.toString(arrayList.toArray()));

        //Set example
//        HashSet set = new HashSet();
//
//        set.add("setElement");
//        set.add("1");
//        set.add(1);
//        set.add(2);
//        set.add("setElement");
//        set.add(1);
//        System.out.println(Arrays.toString(set.toArray()));
//
//        System.out.println("set.contains(2): " + set.contains(2));
//        System.out.println("set.contains(\"2\"): " + set.contains("2"));
//
//        System.out.println("set.isEmpty(): " + set.isEmpty());
//
//        System.out.println("set.size(): " + set.size());
//
//        set.remove("1");
//        System.out.println(Arrays.toString(set.toArray()));
//
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {
//            System.out.println("iterator: " + iterator.next());
//        }
//
//        set.clear();
//        System.out.println(Arrays.toString(set.toArray()));

        ArrayList objectsList = new ArrayList();

        objectsList.add("element1");
        objectsList.add(2);
        objectsList.add(3.7);
        objectsList.add(new Cat());
        objectsList.add(new Dog());

        System.out.println(Arrays.toString(objectsList.toArray()));

        checkArray(objectsList);
    }

    private static void checkArray(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);

            if (obj instanceof Cat) {
                Cat cat = (Cat) list.get(i);
                cat.voice();
            } else if (obj instanceof Dog) {
                ((Dog) obj).voice();
            } else if (obj instanceof String) {
                System.out.println(((String) obj).length());
            }
        }
    }
}
