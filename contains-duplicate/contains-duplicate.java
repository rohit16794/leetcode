class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> numFrequency = new HashMap<>();
        
        for(int i = 0; i <nums.length; i++) {
            numFrequency.put(nums[i], numFrequency.getOrDefault(nums[i], 0) + 1);
            if(numFrequency.get(nums[i]) >=2) return true;
        }
        return false;
    }
}