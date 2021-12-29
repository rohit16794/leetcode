class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int windowStart = 0, result = Integer.MAX_VALUE, currentSum = 0;
        
        for(int windowEnd = 0 ; windowEnd < nums.length; windowEnd++) {
            currentSum += nums[windowEnd];
            
            while(currentSum >=target) {
                result = Integer.min(result, windowEnd - windowStart + 1);
                currentSum -= nums[windowStart];
                ++windowStart;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}