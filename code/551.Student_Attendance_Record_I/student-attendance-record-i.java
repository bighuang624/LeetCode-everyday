// Source : https://leetcode.com/problems/student-attendance-record-i/
// Author : Kyon Huang
// Date   : 2017-11-17

class Solution {
    public boolean checkRecord(String s) {
        int absentTimes = 0;
        char[] array = s.toCharArray();
        for(int i = 0, len = array.length; i < len; i++) {   // more than two continuous 'L' (late)
            if(array[i] == 'A') {
                absentTimes++;
                if(absentTimes > 1)
                    return false;
            }
            else if(array[i] == 'L') {
                if(i+1 < len && array[i+1] == 'L') {
                    i++;
                    if(i+1 < len && array[i+1] == 'L')
                        return false;
                }
            }

        }
        return true;
    }
}