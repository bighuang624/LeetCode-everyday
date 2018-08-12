// Source : https://leetcode.com/problems/largest-number/
// Author : Kyon Huang
// Date   : 2018-08-12

class Solution {
    public String largestNumber(int[] num) {
        if(num == null || num.length == 0)
            return "";

        String[] s_num = new String[num.length];
        for(int i = 0; i < num.length; i++)
            s_num[i] = String.valueOf(num[i]);

        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                String s1 = str1 + str2;
                String s2 = str2 + str1;
                return s2.compareTo(s1);
            }
        };

        Arrays.sort(s_num, comp);
        if(s_num[0].charAt(0) == '0')
            return "0";

        StringBuilder sb = new StringBuilder();
        for(String str : s_num)
            sb.append(str);
        return sb.toString();
    }
}
