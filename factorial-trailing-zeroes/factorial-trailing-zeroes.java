class Solution {
    public int trailingZeroes(int n) {
        int numberOfZeroes = 0;
        
        for(int i = 5; n/i >=1; i*=5){
            numberOfZeroes+=n/i;
        }
        return numberOfZeroes;
    }
}