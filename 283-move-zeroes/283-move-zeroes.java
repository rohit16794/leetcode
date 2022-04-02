class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroElementItr = 0;
        
        for(int i = 0; i<nums.length; i++) {
            if(nums[i]!=0) {
                nums[nonZeroElementItr++] = nums[i];
            }
        }
        
        for(int i = nonZeroElementItr; i<nums.length; i++)
            nums[i] = 0;
    }
}