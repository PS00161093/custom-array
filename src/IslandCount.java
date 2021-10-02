package src;

/**
 * Problem URL: https://practice.geeksforgeeks.org/problems/find-the-number-of-islands/1
 */
public class IslandCount {

    public static void main(String[] args) {

        char[][] grid = {{1, 1, 1, 1, 0},
                {1, 1, 0, 1, 0},
                {1, 1, 0, 0, 1},
                {0, 0, 0, 1, 0},
                {0, 1, 0, 1, 0}
        };

        System.out.println(numOfIsland(grid));
    }

    private static int numOfIsland(char[][] grid) {

        int res = 0;
        if (grid == null || grid.length == 0) return res;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') res += dfs(grid, i, j);
            }
        }

        return res;
    }

    private static int dfs(char[][] grid, int i, int j) {

        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') return 0;

        grid[i][j] = '0';

        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i - 1, j + 1);
        dfs(grid, i + 1, j - 1);
        dfs(grid, i - 1, j - 1);
        dfs(grid, i + 1, j + 1);

        return 1;
    }
}
