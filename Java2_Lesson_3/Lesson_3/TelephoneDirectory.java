package Lesson_3;

import java.util.*;

/**
 * @author Dm.Petrov
 * DATE: 30.11.2021
 */
public class TelephoneDirectory {
    private Map<String, HashSet> phones = new TreeMap<>();

    public Map<String, HashSet> getPhones() {
        return phones;
    }

    public void add(String name, String number) {
        if (phones.containsKey(name)) {
            phones.get(name).add(number);
        } else {
            HashSet<String> set = new HashSet<>();
            set.add(number);
            phones.put(name, set);
        }
    }

    public HashSet get(String name) {
        return phones.get(name);

    }
}
