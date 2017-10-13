# Source : https://leetcode.com/problems/customers-who-never-order/
# Author : Kyon Huang
# Date   : 2017-10-13

# Write your MySQL query statement below
SELECT Name AS Customers FROM Customers
      WHERE Id NOT IN (SELECT CustomerId FROM Orders)