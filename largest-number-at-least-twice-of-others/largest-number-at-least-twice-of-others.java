class Solution {
    public int dominantIndex(int[] nums) {
        int maxElement = 0;
        int maxElementIndex = 0;
        int arrayLength = nums.length;
        
        for(int i = 0; i<arrayLength; i++) {
            if(nums[i] > maxElement) {
                maxElement = nums[i];
                maxElementIndex = i;
            }
        }

        for(int i = 0; i < arrayLength; i++) {
            if(nums[i]*2 > maxElement && nums[i]!=maxElement)
                return -1;
        }
        return maxElementIndex;
    }
}