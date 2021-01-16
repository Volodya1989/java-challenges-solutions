package src.main.java;

public class ReverseStringInArray {
    public static String reverseString(String s) {
        String[] words = s.split(" ");
        String[] reversedArray = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            reversedArray[words.length - 1 - i] = words[i];
        }
        return String.join(" ", reversedArray);
    }

}
