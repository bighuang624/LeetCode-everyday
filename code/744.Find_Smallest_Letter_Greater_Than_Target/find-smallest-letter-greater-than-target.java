// Source : https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// Author : Kyon Huang
// Date   : 2017-12-14

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int len = letters.length;
        if(target >= letters[len-1])
            target -= 26;
        int start = 0;
        int end = len - 1;
        while(start < end) {
            int middle = start + (end - start) / 2;
            if(letters[middle] > target) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return letters[start];
    }
}