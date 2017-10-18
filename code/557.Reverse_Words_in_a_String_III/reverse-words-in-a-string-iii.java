// Source : https://leetcode.com/problems/reverse-words-in-a-string-iii/
// Author : Kyon Huang
// Date   : 2017-10-18

class Solution {
    public String reverseWords(String s) {
        char[] wordsCharArr = s.toCharArray();
        int j = 0;
        for(int i = 0; i < wordsCharArr.length; i++) {
            if(wordsCharArr[i] == ' ') {
                reverseArr(wordsCharArr, j, i-1);
                j = i+1;
            }
        }
        
        reverseArr(wordsCharArr, j, wordsCharArr.length-1);
        
        return String.valueOf(wordsCharArr);
    }
    
    private void reverseArr(char[] charArr, int start, int end) {
        while(start < end) {
            char temp = charArr[start];
            charArr[start] = charArr[end];
            charArr[end] = temp;
            start++;
            end--;
        }
    }
}