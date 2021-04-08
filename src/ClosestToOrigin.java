package src;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.*;

public class ClosestToOrigin {

    public int[][] kClosest(int[][] points, int k) {

        List<Point> list = new ArrayList<>();
        for (int[] point : points) {
            int x = point[0];
            int y = point[1];
            int sum = (x * x) + (y * y);
            list.add(new src.Point(x, y, sum));
        }
        sort(list);

        int[][] res = new int[k][2];
        for (int i = 0; i < k; i++) {
            Point p = list.get(i);
            res[i][0] = p.x;
            res[i][1] = p.y;
        }

        return res;
    }
}

class Point implements Comparable<Point> {

    public int x;
    public int y;
    public int sum;

    public Point(int x, int y, int sum) {
        this.x = x;
        this.y = y;
        this.sum = sum;
    }

    public int compareTo(Point p) {

        return this.sum - p.sum;
    }
}
