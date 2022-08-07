public class MultipleSum {

    public static void main(String[] args) {

        boolean isMultipleOf3;
        boolean isMultipleOf5;
        int maxNumberToCheck = 1000;
        int sum = 0;

        for (int i = 0; i < maxNumberToCheck; i++) {
            isMultipleOf3 = i % 3 == 0;
            isMultipleOf5 = i % 5 == 0;

            if (isMultipleOf3 || isMultipleOf5) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
