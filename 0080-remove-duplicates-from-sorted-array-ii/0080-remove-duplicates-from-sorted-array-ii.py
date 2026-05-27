class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        if len(nums)<2:
            return 2
            
        write=2
        for read in range(2,len(nums)):
            if nums[read]!=nums[write-2]:
                nums[write]=nums[read]
                write+=1
        
        return write