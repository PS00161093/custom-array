package src;

import java.util.regex.Pattern;

public class LongestWord {

    public static void main(String[] args) {

        String text = "Hi !, I am Sharma. TestData Prashant";
        String withoutSpecialCharacter = Pattern.compile("[^a-z^A-Z^ ]").matcher(text).replaceAll("");
        String[] words = withoutSpecialCharacter.split(" ");
        String longestWord = words[0];

        for (String s : words) {
            if (s.length() > longestWord.length()) {
                longestWord = s;
            }
        }

        System.out.println(longestWord);
    }
}
