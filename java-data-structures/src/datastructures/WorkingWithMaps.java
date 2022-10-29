package datastructures;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String [] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Abanoub"));
        map.put(2, new Person("Alex"));
        map.put(3, new Person("Nermin"));

        map.remove(2);

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.entrySet());
        System.out.println(map.keySet());

        map.entrySet().forEach(System.out::println);

        System.out.println("------------");

        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        System.out.println("------------");

        map.forEach((key, person) -> {
            System.out.println(key + " - " + person);
        });

        System.out.println(map.getOrDefault(2, new Person("Hamada")));

        System.out.println(map.values());

        map.clear();

        System.out.println(map.size());
    }

    record Person(String name) {}
}
