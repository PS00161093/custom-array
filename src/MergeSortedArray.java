package src;

import static java.util.Arrays.stream;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] firstArray = {3, 6, 9};
        int[] secondArray = {1, 3, 9, 10};

        stream(mergeAndSort(firstArray, secondArray)).forEach(System.out::println);
    }


    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {

        int firstArrayLength = firstArray.length;
        int secondArrayLength = secondArray.length;
        int[] resultantArray = new int[firstArrayLength + secondArrayLength];

        int firstArrayIndex = 0, secondArrayIndex = 0, resultantArrayIndex = 0;

        while (firstArrayIndex < firstArrayLength && secondArrayIndex < secondArrayLength) {

            if (firstArrayElement(firstArray, firstArrayIndex) < secondArrayElement(secondArray, secondArrayIndex)) {
                resultantArray[resultantArrayIndex] = firstArrayElement(firstArray, firstArrayIndex);
                firstArrayIndex++;
            } else {
                resultantArray[resultantArrayIndex] = secondArrayElement(secondArray, secondArrayIndex);
                secondArrayIndex++;
            }

            resultantArrayIndex++;
        }

        while (firstArrayIndex < firstArrayLength)
            resultantArray[resultantArrayIndex++] = firstArray[firstArrayIndex++];

        while (secondArrayIndex < secondArrayLength)
            resultantArray[resultantArrayIndex++] = secondArray[secondArrayIndex++];

        return resultantArray;
    }

    private static int secondArrayElement(int[] secondArray, int secondArrayIndex) {

        return secondArray[secondArrayIndex];
    }

    private static int firstArrayElement(int[] firstArray, int firstArrayIndex) {

        return firstArray[firstArrayIndex];
    }

}
