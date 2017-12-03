// Source : https://leetcode.com/problems/complex-number-multiplication/
// Author : Kyon Huang
// Date   : 2017-12-03

class Solution {
    public String complexNumberMultiply(String a, String b) {
        String[] asplit = a.split("\\+");    // 要转义
        String[] bsplit = b.split("\\+");
        int aint = Integer.parseInt(asplit[0]);
        int ai = Integer.parseInt(asplit[1].split("i")[0]);
        int bint = Integer.parseInt(bsplit[0]);
        int bi = Integer.parseInt(bsplit[1].split("i")[0]);
        
        int resultint = aint * bint - ai * bi;
        int resulti = aint * bi + ai * bint;
        return resultint + "+" + resulti + "i";
    }
}