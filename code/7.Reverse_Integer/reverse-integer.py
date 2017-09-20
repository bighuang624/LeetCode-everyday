# Source : https://leetcode.com/problems/reverse-integer/
# Author : Kyon Huang
# Date   : 2017-09-20

# 第一思路，非最优解法

class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        result = 0
        isNegative = abs(x) != x
        max = 2 ** 31 - 1
        if x % 10 == 0 and x != 0:
            while x % 10 == 0:
                x /= 10
                
        if isNegative:
            x *= -1

        while x != 0:
            result = result * 10 + x % 10
            x /= 10
            
        if result >= max:
            return 0
                
        if isNegative:
            result *= -1
        
        return result
