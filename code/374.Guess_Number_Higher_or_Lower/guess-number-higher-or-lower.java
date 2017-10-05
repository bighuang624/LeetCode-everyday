// Source : https://leetcode.com/problems/guess-number-higher-or-lower/
// Author : Kyon Huang
// Date   : 2017-10-05

/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int first = 1, last = n;
        while(first < last) {
            int mid = first + (last - first) / 2;
            if(guess(mid) == 0) {
                return mid;
            } else if(guess(mid) == 1) {
                first = mid + 1;
            } else {
                last = mid;
            }
        }
        return first;
    }
}