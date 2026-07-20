class Solution {

    public int uniquePaths(int m, int n) {

        // Stores the previous row
        int[] prev = new int[n];

        // Traverse each row
        for (int i = 0; i < m; i++) {

            // Create a new current row for every iteration
            int[] curr = new int[n];

            // Traverse each column
            for (int j = 0; j < n; j++) {

                // Starting cell
                if (i == 0 && j == 0) {
                    curr[j] = 1;
                    continue;
                }

                int up = 0;
                int left = 0;

                // Get value from previous row
                if (i > 0)
                    up = prev[j];

                // Get value from left cell of current row
                if (j > 0)
                    left = curr[j - 1];

                // Total ways
                curr[j] = up + left;
            }

            // Current row becomes previous row
            prev = curr;
        }

        // Bottom-right answer
        return prev[n - 1];
    }
}