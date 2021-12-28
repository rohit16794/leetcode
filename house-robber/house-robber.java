class Solution {
    public int rob(int[] nums) {
        int arrayLength= nums.length;
        int maxTillNow[] = new int[arrayLength];
        if(arrayLength ==1) return nums[0];
        if(arrayLength == 2) return nums[0] >= nums[1] ? nums[0] : nums[1];

        maxTillNow[0] = nums[0];
        maxTillNow[1] = nums[1];
        int currentMax;
        for(int i = 2; i<arrayLength; i++) {
            currentMax = Integer.MIN_VALUE;

            for(int j = i-2; j>=0; j--) {
                if(maxTillNow[j] > currentMax) 
                    currentMax = maxTillNow[j];
            }
            maxTillNow[i] = currentMax + nums[i];
        }
        currentMax = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < arrayLength; i++) {
            if(maxTillNow[i] > currentMax) currentMax = maxTillNow[i];
        }
        return currentMax;
    }
}