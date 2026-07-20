import java.util.Arrays;

class Solution {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        return helper(m - 1, n - 1, obstacleGrid, dp);
    }

    public int helper(int i, int j, int[][] obstacleGrid, int[][] dp) {

        // Outside grid
        if (i < 0 || j < 0)
            return 0;

        // Obstacle
        if (obstacleGrid[i][j] == 1)
            return 0;

        // Start cell
        if (i == 0 && j == 0)
            return 1;

        // Already computed
        if (dp[i][j] != -1)
            return dp[i][j];

        int up = helper(i - 1, j, obstacleGrid, dp);
        int left = helper(i, j - 1, obstacleGrid, dp);

        dp[i][j] = up + left;

        return dp[i][j];
    }
}