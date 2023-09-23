class Solution {
    public int pivotIndex(int[] nums) {
        int length = nums.length;
        int arraySum = 0;

        for(int num : nums) {
            arraySum+=num;
        }

        int sumTillNow = 0;
        for(int i = 0; i<length; i++) {
            if((arraySum - (sumTillNow + nums[i])) == sumTillNow)
            return i;
            sumTillNow += nums[i];
        }
        return -1;
    }
}