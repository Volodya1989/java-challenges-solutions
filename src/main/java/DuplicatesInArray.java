package src.main.java;

public class DuplicatesInArray {
    public static boolean duplicatesInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("duplicates found" + arr[i] + " " + arr[j]);
                    return true;
                }
            }
        }
        return false;
    }
}
