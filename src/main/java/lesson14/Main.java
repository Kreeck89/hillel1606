package lesson14;

import lesson10.Animal;
import lesson10.Cat;
import lesson10.Dog;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        HashMap map = new HashMap();
//        map.put("FIRST", new Cat());
//        map.put(3, "second");
//        map.put(new Cat(), new Dog());
//        Cat keyCat = new Cat();
//        map.put(keyCat, new Dog());
//
////        System.out.println("map.containsKey(\"FIRST\"): " + map.containsKey("FIRST"));
////        System.out.println("map.containsKey(new Cat()): " + map.containsKey(new Cat()));
////        System.out.println("map.containsKey(keyCat): " + map.containsKey(keyCat));
////
////        System.out.println("map.containsValue(\"second\"): " + map.containsValue("second"));
////
////        System.out.println("map.isEmpty(): " + map.isEmpty());
////        System.out.println("map.size(): " + map.size());
//
//        map.put(null, "null value");
//        map.put(null, "null value second");
//        map.put("nullKey", null);
//        map.put("nullKey", null);
//
////        Set set = map.keySet();
////        Iterator iterator = set.iterator();
////        while (iterator.hasNext()) {
////            System.out.println(iterator.next());
////        }
//
////        Collection values = map.values();
////        Iterator valuesIterator = values.iterator();
////        while (valuesIterator.hasNext()) {
////            System.out.println(valuesIterator.next());
////        }
//
//        System.out.println("map.get(null): " + map.get(null));
//        System.out.println("map.remove(null): " + map.remove(null));
//        System.out.println("map.get(null): " + map.get(null));
//        System.out.println("map.get(some string): " + map.get("some string"));
//
//        Dog dog = (Dog) map.get(keyCat);
//        dog.voice();
//
//        map.clear();
//        System.out.println("map.size(): " + map.size());
//
//        byte b = 1;
//        Byte by = new Byte((byte) 12);
//        Integer integer = new Integer(1000);
//        integer = 1000;
//        int parsedInt = Integer.parseInt("12");
//        System.out.println(parsedInt);

        //GENERICS

        ArrayList<String> stringArrayList = new ArrayList<String>();

        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(12);

        ArrayList<Byte> bytes = new ArrayList<Byte>();
        bytes.add((byte) 12);

        ArrayList<Double> doubles = new ArrayList<Double>();
        double doubleExample = 15.34;
        doubles.add((double) 12);
        doubles.add(doubleExample);
        doubles.add(12.00);

        HashSet<Animal> cats = new HashSet<Animal>();
        cats.add(new Cat());
        cats.add(new Dog());
//        cats.add("String example");

        HashMap<String, Cat> catHashMap = new HashMap<>();
        catHashMap.put("first", new Cat());
        catHashMap.put("2", new Cat());
//        catHashMap.put("third", new Dog());

        ArrayList<ArrayList<String>> studentsAnonimAnswers = new ArrayList<>();


        HashMap<String, HashMap<String, String>> schedulerMap = new HashMap<>();
        HashMap<String, String> mondayMap = new HashMap<>();
        mondayMap.put("1", "read the book");
        mondayMap.put("2", "study English");
        schedulerMap.put("Monday", mondayMap);

        HashMap<String, String> tuesdayMap = new HashMap<String, String>();
        tuesdayMap.put("1", "Relaxed");
        tuesdayMap.put("2", "Home work");
        schedulerMap.put("Tuesday", tuesdayMap);

        HashMap<String, LinkedList<Integer>> studentsAnswer = new HashMap<>();

        //WILDCARDS

        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Cat> catsList = new ArrayList<>();
        ArrayList<Dog> dogsList = new ArrayList<>();
        wildCardsProducerExample(animals);
        wildCardsProducerExample(catsList);
        wildCardsProducerExample(dogsList);

        wildCardsConsumerExample(animals);
        wildCardsConsumerExample(catsList);

//        wildCardsConsumerExample(dogsList);
    }

    private static ArrayList<Dog> wildCardsProducerExample(ArrayList<? extends Animal> animals) {
        //some logic
        final ArrayList<Dog> dogs = new ArrayList<>();
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Dog) {
                dogs.add((Dog) animals.get(i));
            }
        }
        animals.get(0);
//        animals.add(new Animal());
        return dogs;
    }

    private static void wildCardsConsumerExample(ArrayList<? super Cat> animals) {
        animals.add(new Cat());
//        animals.add(new Animal());

    }
}
