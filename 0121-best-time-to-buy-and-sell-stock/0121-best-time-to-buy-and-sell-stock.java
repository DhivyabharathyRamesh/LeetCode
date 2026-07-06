class Solution {
    public int maxProfit(int[] nums) {
        int sell=nums[0];
        int profit=0;
       for(int i=0;i<nums.length;i++){
              sell=Math.min(nums[i],sell);
              profit=Math.max(profit,nums[i]-sell);
       }
       return profit; 
    }
}