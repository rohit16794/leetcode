/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low =1, high = n;
        int mid ;
        while(low <=high) {
            mid = low + (high - low)/2;
            if(!isBadVersion(mid)) low = mid + 1;
            else high = mid-1;
        }
        return low;
    }
}