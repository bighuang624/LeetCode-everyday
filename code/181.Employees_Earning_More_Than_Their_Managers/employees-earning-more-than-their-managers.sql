# Source : https://leetcode.com/problems/employees-earning-more-than-their-managers/
# Author : Kyon Huang
# Date   : 2017-10-13

# Write your MySQL query statement below
SELECT e.Name AS Employee FROM Employee e
    WHERE e.ManagerId IS NOT NULL AND e.Salary > (SELECT Salary FROM Employee 
                                                  WHERE Id = e.ManagerId)