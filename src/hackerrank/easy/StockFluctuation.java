import java.util.TreeSet;

/**
 * <a href="https://aonecode.com/interview-questions/Stock-Fluctuation">...</a>*
 */
public class StockFluctuation {

    public static void main(String[] args) {
        int[] arr = {7, 10, 5, 3};
        System.out.println(sumOfFluctuation(arr));
    }

    public static int sumOfFluctuation(int[] prices) {
        int sum = 0;
        TreeSet<Integer> set = new TreeSet<>();
        int len = prices.length;
        for (int i = 0; i < len; i++) {
            int j = i + 1;
            while (j < len) {
                int x = i;
                while (x <= j) {
                    set.add(prices[x]);
                    x++;
                }
                sum += set.last() - set.first();
                j++;
            }
            set.clear();
        }
        return sum;
    }

}
