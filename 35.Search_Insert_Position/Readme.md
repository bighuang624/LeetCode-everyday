# Search Insert Position 

## 题目

Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
`[1,3,5,6]`, 5 → 2
`[1,3,5,6]`, 2 → 1
`[1,3,5,6]`, 7 → 4
`[1,3,5,6]`, 0 → 0 

## 疑问

一看就知道最好的方法是二分搜索，时间复杂度 logN。然而我用 JavaScript 写怎么都过不了。这里放上的两个版本，Java 版是最后 Accepted 的，我认为我写的 JavaScript 版和 Java 版是一样的。有一个示例机算给的结果和我算的不一样，不知道是什么原因...
