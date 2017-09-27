# Source : https://leetcode.com/problems/big-countries/
# Author : Kyon Huang
# Date   : 2017-09-27

# Write your MySQL query statement below
SELECT name, population, area FROM World
    WHERE area > 3000000 OR population > 25000000;