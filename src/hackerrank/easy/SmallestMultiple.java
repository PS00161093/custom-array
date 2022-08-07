public class SmallestMultiple {

    public static void main(String[] args) {
        long start = 20;
        boolean found = false;
        while (!found) {
            if (
                    start % 7 == 0 && start % 8 == 0 && start % 9 == 0 && start % 11 == 0 && start % 13 == 0 && start % 15 == 0 && start % 16 == 0 && start % 17 == 0 && start % 19 == 0 && start % 20 == 0
            ) {
                System.out.println(start);
                break;
            }
            start++;
        }
    }
}
