package src;

public class MaxSubArray {

    public static void main(String[] args) {

        int[] inputArray = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSubArraySum = inputArray[0];
        int currentSum = 0;

        for (int element : inputArray) {
            if (currentSum < 0) {
                currentSum = 0;
            }
            currentSum = currentSum + element;
            maxSubArraySum = Math.max(maxSubArraySum, currentSum);
        }
        System.out.println(maxSubArraySum);
    }

}