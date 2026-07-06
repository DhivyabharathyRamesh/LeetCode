class Solution {
    public int removeElement(int[] nums, int val) {
        int write=0;
        for(int right=0;right<nums.length;right++){

            if(nums[right]!=val){
                nums[write]=nums[right];
                write++;
            }
        }
        return write;
    }
}