// Source : https://leetcode.com/problems/first-bad-version/
// Author : Kyon Huang
// Date   : 2017-11-09 

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int first = 1;
        int last = n;
        while(first <= last) {
            int middle = first + (last - first)/2;
            boolean middleResult = isBadVersion(middle);
            if(!middleResult)
                first = middle+1;
            else {
                if(!isBadVersion(middle-1))
                    return middle;
                else
                    last = middle-1;
            }
            
        }
        return 1;
    }
}