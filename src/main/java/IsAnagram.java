package src.main.java;

import java.util.Arrays;

public class IsAnagram {
//        public static boolean isAnagram(String s1, String s2) {
//        if (s1.length() != s2.length()) {
//            return false;
//        }
//        char[] str1 = s1.toCharArray();
//        char[] str2 = s2.toCharArray();
//
//        Arrays.sort(str1);
//        Arrays.sort(str2);
//        for (int i = 0; i < str1.length; i++) {
//            if (str1[i] != str2[i]) {
//                return false;
//            }
//        }
//        return true;
//    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        for (int i = 0; i < str2.length; i++) {
            if (str1[i] != str2[i]) return false;
        }
        return true;
    }

}
