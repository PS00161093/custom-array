import java.util.HashSet;
import java.util.Set;

public class EvenFibonacci {

    public static void main(String[] args) {
        long firstNumber = 1;
        long secondNumber = 2;
        long nextNumber;

        long maxNumber = 4000000;
        long currentNumber = 1;

        long sum = 0;
        Set<Long> evenNumbers = new HashSet<>();

        while (currentNumber < maxNumber) {
            if (firstNumber % 2 == 0) evenNumbers.add(firstNumber);
            if (secondNumber % 2 == 0) evenNumbers.add(secondNumber);
            nextNumber = firstNumber + secondNumber;
            if (nextNumber % 2 == 0) evenNumbers.add(nextNumber);

            firstNumber = secondNumber;
            secondNumber = nextNumber;
            currentNumber = nextNumber;
        }

        for (long n : evenNumbers) sum += n;
        System.out.println(sum);
    }
}
