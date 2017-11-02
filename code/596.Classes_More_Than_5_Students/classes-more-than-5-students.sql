# Source : https://leetcode.com/problems/classes-more-than-5-students/
# Author : Kyon Huang
# Date   : 2017-11-01

SELECT class FROM courses
GROUP BY class
HAVING COUNT(DISTINCT student) >= 5;