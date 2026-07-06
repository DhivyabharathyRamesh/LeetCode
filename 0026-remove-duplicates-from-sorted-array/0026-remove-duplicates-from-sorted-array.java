class Solution {
    public int removeDuplicates(int[] nums) {
        int write=1;
        for(int right=1;right<nums.length;right++){

            if(nums[right]!=nums[right-1]){
                nums[write]=nums[right];
                write++;
            }
        }
        return write;
    }
}