class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> elementIndexMap = new HashMap<>();
        int answer[] = new int[2];
        for(int i = 0; i <nums.length; i++) {
            elementIndexMap.put(nums[i], i);
        }
        
        for(int i = 0; i<nums.length; i++) {
            int currElementIndex = elementIndexMap.getOrDefault(target - nums[i], -1);
            
            if(currElementIndex!=-1&& currElementIndex!=i) {
                answer[0] = i;
                answer[1] = currElementIndex;
            }
        }
        return answer;
    }
}