import java.util.TreeSet;

public class LargestPalindromeProduct {

    public static void main(String[] args) {
        long firstNumber = 999;
        long secondNumber = 999;
        long product;
        TreeSet<Long> palindromes = new TreeSet<>();

        while (secondNumber >= 100) {
            while (firstNumber >= 100) {
                product = firstNumber * secondNumber;
                String productString = String.valueOf(product);
                String productReverseString = new StringBuilder(String.valueOf(product)).reverse().toString();

                if (productString.equals(productReverseString)) {
                    palindromes.add(product);
                }

                firstNumber--;
            }

            firstNumber = 999;
            secondNumber--;
        }

        System.out.println(palindromes.last());
    }
}
