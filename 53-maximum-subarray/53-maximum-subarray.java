class Solution {
    public int maxSubArray(int[] arr) {
        int currentMaxSum = arr[0];
        int finalAnswer = arr[0];
        
        for(int i = 1; i<arr.length; i++) {
            currentMaxSum = Math.max(arr[i], currentMaxSum + arr[i]);
            finalAnswer = Math.max(finalAnswer, currentMaxSum);
        }
        return finalAnswer;
    }
}