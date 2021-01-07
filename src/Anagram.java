package src;

public class Anagram {

    public static void main(String[] args) {

        String string = "ABCD";
        createAnagram(string, 0, string.length() - 1);
    }

    private static void createAnagram(String string, int startIndex, int endIndex) {

        if (startIndex == endIndex) System.out.println(string);
        else {
            for (int i = startIndex; i <= endIndex; i++) {
                string = swap(string, startIndex, i);
                createAnagram(string, startIndex + 1, endIndex);
                string = swap(string, startIndex, i);
            }
        }
    }

    private static String swap(String string, int startIndex, int i) {

        char[] chars = string.toCharArray();
        chars[startIndex] = chars[i];

        char temp = chars[startIndex];
        chars[i] = temp;

        return String.valueOf(chars);
    }
}
