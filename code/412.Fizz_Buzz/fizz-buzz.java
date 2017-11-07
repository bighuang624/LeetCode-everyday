// Source : https://leetcode.com/problems/fizz-buzz/
// Author : Kyon Huang
// Date   : 2017-11-07

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList();
        for(int i = 1; i <= n; i++) {
            String word;
            if(i % 3 != 0 && i % 5 != 0)
                word = "" + i;
            else if(i % 3 == 0 && i % 5 == 0)
                word = "FizzBuzz";
            else if(i % 3 == 0)
                word = "Fizz";
            else
                word = "Buzz";
            list.add(word);
        }
        
        return list;
    }
}