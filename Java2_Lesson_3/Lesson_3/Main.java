package Lesson_3;

import java.util.*;

/**
 * @author Dm.Petrov
 * DATE: 30.11.2021
 */
public class Main {
    public static void main(String[] args) {
        String[] clubs = {"Spartak", "Zenit", "Cska", "Dinamo", "Milan", "Zenit", "Zenit", "Barcelona", "Milan"};
        HashSet<String> uniqueClubs = new HashSet<>();
        uniqueClubs.addAll(Arrays.asList(clubs));
        System.out.println(uniqueClubs);
        Map<String, Integer> clubAmount = new HashMap<>();
        for (int i = 0; i < clubs.length; i++) {
            if (clubAmount.containsKey(clubs[i])) {
                clubAmount.put(clubs[i], clubAmount.get(clubs[i]) + 1);
            } else {
                clubAmount.put(clubs[i], 1);
            }

        }
        System.out.println(clubAmount);


        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.add("Ivanov","9993535");
        telephoneDirectory.add("Petrov","5347891");
        telephoneDirectory.add("Ivanov","9973536");
        telephoneDirectory.add("Sidorov","891115758345");
        System.out.println(telephoneDirectory.getPhones());
        System.out.println(telephoneDirectory.get("Ivanov"));

    }
}
