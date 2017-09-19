# Source : https://leetcode.com/problems/find-all-duplicates-in-an-array/
# Author : Kyon Huang
# Date   : 2017-09-19

class Solution(object):
    def findDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        res = []
        for x in nums:
            if nums[abs(x)-1] < 0:
                res.append(abs(x))
            else:
                nums[abs(x)-1] *= -1
        return res
