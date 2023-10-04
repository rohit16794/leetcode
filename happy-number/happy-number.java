class Solution {
    public boolean isHappy(int n) {
        
        while(n!=1 && getSumOfSquaredDigits(n)!=4) {
            n = getSumOfSquaredDigits(n);
        }
        return n ==1;
    }
    
    private int getSumOfSquaredDigits(int n) {
        int sum = 0;
        
        while(n>0) {
            int currentDigit = n%10;
            sum += currentDigit*currentDigit;
            n = n/10;
        }
        return sum;
    }
}