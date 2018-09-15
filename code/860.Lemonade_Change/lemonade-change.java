// Source : https://leetcode.com/problems/lemonade-change/
// Author : Kyon Huang
// Date   : 2018-09-15

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveBillNum = 0, tenBillNum = 0;
        for(int i = 0; i < bills.length; i++) {
            if(bills[i] == 5)
                fiveBillNum++;
            else if(bills[i] == 10) {
                fiveBillNum--;
                tenBillNum++;
            }
            else {
                if(tenBillNum > 0)
                    tenBillNum--;
                else
                    fiveBillNum -= 2;
                fiveBillNum--;
            }
            if(fiveBillNum < 0 || tenBillNum < 0) {
                return false;
            }
                
        }
        return true;
    }
}