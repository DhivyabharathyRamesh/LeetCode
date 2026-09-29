class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            
            if (currentSum == target) {
                // Return 1-based indices by adding 1 to our 0-based pointers
                return new int[]{left + 1, right + 1};
            } 
            // If the sum is too small, move the left pointer right to get a bigger number
            else if (currentSum < target) {
                left++;
            } 
            // If the sum is too big, move the right pointer left to get a smaller number
            else {
                right--;
            }
        }
        
        return new int[]{-1, -1};
    }
}
