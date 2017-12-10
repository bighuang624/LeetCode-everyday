// Source : https://leetcode.com/problems/reverse-vowels-of-a-string/
// Author : Kyon Huang
// Date   : 2017-12-10

class Solution {
    public String reverseVowels(String s) {
        if(s == null || s.length() == 0) 
            return s;
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('A');
        set.add('e');
        set.add('E');
        set.add('i');
        set.add('I');
        set.add('o');
        set.add('O');
        set.add('u');
        set.add('U');
        
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while(i < j) {
            while(i < j && !set.contains(arr[i])) {
                i++;
            }
            while(i < j && !set.contains(arr[j])) {
                j--;
            }

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++; 
            j--;
        }
        return new String(arr); 
    }
}