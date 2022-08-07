public class LargestPrimeFactor {

    public static void main(String[] args) {
        long number = 600851475143L;
        long i;
        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }

        System.out.println(i);
    }

    static long maxPrimeFactors(long val) {
        long max_prime = -1;
        while (val % 2 == 0) {
            max_prime = 2;
            val /= 2;
        }

        for (int i = 3; i <= Math.sqrt(val); i += 2) {
            while (val % i == 0) {
                max_prime = i;
                val = val / i;
            }
        }
        if (val > 2) {
            max_prime = val;
        }

        return max_prime;
    }
}
