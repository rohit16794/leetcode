class Solution {
    public int[] sortedSquares(int[] nums) {
        int arrayLength = nums.length;
        int left = 0, right = arrayLength - 1;
        int result[] = new int[arrayLength];
        int currentPos = arrayLength - 1;
        
        while(left <= right) {
            int leftSquared = nums[left]*nums[left];
            int rightSquared = nums[right]*nums[right];
            
            if(leftSquared >= rightSquared) {
               result[currentPos--] =  leftSquared;
                ++left;
            } else {
                result[currentPos--] =  rightSquared;
                --right;
            }
        }
        return result;
    }
}