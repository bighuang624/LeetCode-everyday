// Source : https://leetcode.com/problems/self-dividing-numbers/
// Author : Kyon Huang
// Date   : 2017-11-22

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new LinkedList<Integer>();
        for(int i = left; i <= right; i++) {
            if(i < 10 || isSelfDividing(i))
                list.add(i);
        }
        return list;
    }
    
    private boolean isSelfDividing(int n) {
        int m = n;
        while(m > 0) {
            int i = m % 10;
            if(i == 0 || n % i != 0)
                return false;
            m /= 10;
        }
        return true;
    }
}