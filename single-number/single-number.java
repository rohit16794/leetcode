class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for(int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        for(int num : nums) {
            if(freqMap.get(num) == 1)
                return num;
        }
        return -1;
    }
}