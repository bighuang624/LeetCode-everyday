# Single Element in a Sorted Array

## 题目

Given a sorted array consisting of only integers where every element appears twice except for one element which appears once. Find this single element that appears only once.

**Example 1:**

```
Input: [1,1,2,3,3,4,4,8,8]
Output: 2
```

**Example 2:**

```
Input: [3,3,7,7,10,11,11]
Output: 10
```

**Note:** Your solution should run in O(log n) time and O(1) space. 

## 优化过程

第一次的解法是从 0 开始`i = i + 2`的 for 循环。要找的单独元素肯定在偶数位，所以只要`nums[i] != nums[i + 1]`，就可以找到`nums[i]`并返回之。

然而这个方法应该为 O(n)。竟然过了，看来时间 O(logn) 的要求不是硬性的...

看到这个时间复杂度的要求，感觉最佳解法和**二分搜索**有关。在沿着这个思路一边写一边想了一会无果后，将命题转变为：**找到与下一个奇数位大小不同的偶数位元素**。

继续想了一下无果，只好看 Discuss。发现和我的想法只有一点不同：start、end、mid 先都除以 2，之后再乘 2 来判断奇偶。

最后有两点：

1. 注意细节。包括二分搜索中 mid 加不加 1，while 循环的限制条件 start 和 end 是小于还是小于等于。
2. 感觉写 LeetCode 还是 Java 比 JavaScript 爽一些，可能是强类型的原因...
