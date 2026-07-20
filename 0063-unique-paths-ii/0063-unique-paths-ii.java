class Solution {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        // If the starting cell is blocked, no path exists.
        if (obstacleGrid[0][0] == 1)
            return 0;

        // Stores the previous row.
        int[] prev = new int[n];

        // Traverse each row.
        for (int i = 0; i < m; i++) {

            // Stores the current row.
            int[] curr = new int[n];

            // Traverse each column.
            for (int j = 0; j < n; j++) {

                // Starting cell.
                if (i == 0 && j == 0) {
                    curr[j] = 1;
                    continue;
                }

                // If current cell is an obstacle,
                // no path can reach here.
                if (obstacleGrid[i][j] == 1) {
                    curr[j] = 0;
                    continue;
                }

                int up = 0;
                int left = 0;

                // Take value from previous row.
                if (i > 0)
                    up = prev[j];

                // Take value from current row's previous column.
                if (j > 0)
                    left = curr[j - 1];

                // Total paths to current cell.
                curr[j] = up + left;
            }

            // Current row becomes previous row.
            prev = curr;
        }

        // Answer is stored in the last cell.
        return prev[n - 1];
    }
}