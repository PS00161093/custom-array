package src;

public class MoveZero {

    public static void main(String[] args) {

        int[] input = {0, 1, 0, 3, 12};

        moveZerosToEnd(input); //Big-O = O(n^2) - Not efficient.

        moveZerosToEnd2(input); //Big-O = O(n) - Efficient.

    }

    //Big-O = O(n) - Efficient.
    private static void moveZerosToEnd2(int[] inputArray) {

        int index = 0;
        int start = 0;

        while (index < inputArray.length) {

            if (inputArray[start] == 0 && inputArray[index] != 0) {
                int temp = inputArray[index];
                inputArray[index] = inputArray[start];
                inputArray[start++] = temp;
            } else if (inputArray[start] != 0) {
                start++;
            }
            index++;
        }

        printArrayItems(inputArray);
    }

    //Big-O = O(n^2) - Not efficient.
    private static void moveZerosToEnd(int[] input) {
        for (int i = 0; i < input.length; i++) {

            if (input[i] == 0) {
                int temp = input[i];
                for (int j = i; j < input.length - 1; j++) {
                    input[j] = input[j + 1];
                }
                input[input.length - 1] = temp;
            }
        }
        printArrayItems(input);
    }

    private static void printArrayItems(int[] input) {

        for (int k : input) {
            System.out.print(k + " ");
        }
    }
}
