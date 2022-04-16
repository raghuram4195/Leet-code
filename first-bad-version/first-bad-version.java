/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n==1)
            return 1;
        int res =1;
        //Solution s = new Solution();
        int i=1;
        int j=n;
        while(i<=j)
        {
            int mid = i+(j-i)/2;
            if(isBadVersion(mid))
            {
                res = mid;
                j = mid - 1;
            }
            else
            {
                i = mid + 1;
            }
        }
        return res;
        
    }
}