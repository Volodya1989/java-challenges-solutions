package src.main.java;

import java.util.*;

public class OccurrenceGivenWordInGivenArray {
//    Find out the occurrence of a given word in a given array. The word may occur left to right, up to down and vice versa.

    public static void occurrenceGivenWordInGivenArray(String[] arr) {
//        List asList = Arrays.asList(arr);
//        Set<String> mySet = new HashSet<String>(asList);
//        for (String s : mySet) {
//            System.out.println(s + " " + Collections.frequency(asList, s));
//        }
        List asList = Arrays.asList(arr);
        Set<String> mySet = new HashSet<String>(asList);
        for (String s : mySet) {
            System.out.println(s + " " + Collections.frequency(asList, s));
        }
    }
}
