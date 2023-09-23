class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int arrayLength = nums.length;
        int result = 0;
        for(int i = 0; i < arrayLength; i++) {
            if(nums[i] == 1) {
                int currentMaxLength = 1;
                for(int j = i+1; j<arrayLength && nums[j]==1; j++) {
                    currentMaxLength++;
                }
                if(currentMaxLength > result)
                    result = currentMaxLength;
            }
        }
        return result;      
    }
}