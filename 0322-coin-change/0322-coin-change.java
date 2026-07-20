class Solution {
    public int coinChange(int[] coins, int amount) {

        int n = coins.length;

        int[] prev = new int[amount + 1];

        // Base row
        for (int amt = 0; amt <= amount; amt++) {
            if (amt % coins[0] == 0)
                prev[amt] = amt / coins[0];
            else
                prev[amt] = (int) 1e9;
        }

        for (int index = 1; index < n; index++) {

            int[] curr = new int[amount + 1];

            for (int amt = 0; amt <= amount; amt++) {

                int notTake = prev[amt];

                int take = (int) 1e9;

                if (coins[index] <= amt)
                    take = 1 + curr[amt - coins[index]];

                curr[amt] = Math.min(take, notTake);
            }

            prev = curr;
        }

        int ans = prev[amount];

        return ans >= (int)1e9 ? -1 : ans;
    }
}