class Solution {
    public void moveZeroes(int[] nums) {
        int temp=0;
        int right=0;
        for(int left=0;left<nums.length;left++){
            if(nums[left]!=0){
                temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                
                right++;
            }
            


        }
   
    }
}