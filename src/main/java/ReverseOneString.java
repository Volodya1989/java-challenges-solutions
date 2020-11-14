package src.main.java;

public class ReverseOneString {
    public void reverseString(String actual) {
        StringBuilder expected = new StringBuilder();
        for (int i = actual.length() - 1; i >= 0; i--) {
            expected.append(actual.charAt(i));
        }
        if (!actual.equals(expected.toString())) {
            System.out.println("erro");
        } else {
            System.out.println("succcess");
        }
        System.out.println(expected);
    }
}
