package src;

public class WordSearch {

    public static void main(String[] args) {

        char[][] input = {{'B', 'N', 'E', 'Y', 'S'},
                          {'H', 'E', 'D', 'E', 'S'},
                          {'S', 'G', 'N', 'D', 'E'}
        };

        String word = "BHEDNDE";

        System.out.println(search(input, word));
    }

    private static boolean search(char[][] input, String word) {

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] == word.charAt(0) && isNextCharPresent(input, i, j, 0, word)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean isNextCharPresent(char[][] input, int i, int j, int count, String word) {

        if (count == word.length()) return true;

        if (i < 0 || i >= input.length || j < 0 || j >= input[i].length || input[i][j] != word.charAt(count)) return false;

        char temp = input[i][j];
        input[i][j] = ' ';

        boolean found = isNextCharPresent(input, i + 1, j, count + 1, word) ||
                        isNextCharPresent(input, i - 1, j, count + 1, word) ||
                        isNextCharPresent(input, i, j + 1, count + 1, word) ||
                        isNextCharPresent(input, i, j - 1, count + 1, word);

        input[i][j] = temp;

        return found;
    }

}