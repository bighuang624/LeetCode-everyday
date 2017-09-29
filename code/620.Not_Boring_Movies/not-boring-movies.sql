# Source : https://leetcode.com/problems/not-boring-movies/
# Author : Kyon Huang
# Date   : 2017-09-29

# Write your MySQL query statement below
SELECT * FROM cinema
    WHERE (id % 2 = 1) AND (description != 'boring')
    ORDER BY rating DESC;