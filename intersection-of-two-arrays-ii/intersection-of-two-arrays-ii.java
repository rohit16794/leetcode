class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) 
            return intersect(nums2, nums1);
        
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        
        for(int ele : nums1) {
           frequencyMap.put(ele, frequencyMap.getOrDefault(ele,0) + 1); 
        }
        
        int k = 0;
        
        for(int ele : nums2) {
            int elementFrequency = frequencyMap.getOrDefault(ele, 0);
            
            if(elementFrequency > 0) {
                nums1[k++] = ele;
                frequencyMap.put(ele, elementFrequency-1);
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }
}