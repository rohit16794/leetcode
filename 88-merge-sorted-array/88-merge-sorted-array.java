class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int firstArrayIndex = m-1, secondArrayIndex = n-1, resultArrayIndex = m+n-1;
        
        while(firstArrayIndex >=0 && secondArrayIndex >=0) {
        nums1[resultArrayIndex--] = nums1[firstArrayIndex] > nums2[secondArrayIndex]?nums1[firstArrayIndex--]:nums2[secondArrayIndex--];
        }
        
        while(firstArrayIndex >=0) {
            nums1[resultArrayIndex--] = nums1[firstArrayIndex--];
        }
        
        while(secondArrayIndex >=0) {
            nums1[resultArrayIndex--] = nums2[secondArrayIndex--];
        }
    }
}