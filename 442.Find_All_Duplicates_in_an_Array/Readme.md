# Find All Duplicates in an Array

## 题目

Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear **twice** and others appear **once**.

Find all the elements that appear **twice** in this array.

Could you do it without extra space and in O(n) runtime?

**Example:**

```
Input:
[4,3,2,7,8,2,3,1]

Output:
[2,3]
```

## 解题过程

初始思路是建一个大小为 n 的数组来存储出现次数。用这个思路很快 Accepted，除了不太熟悉 List 而写错了两次靠 Run Code 改正外...这个方法时间复杂度为 O(n)，但开辟了新空间。所以找优化算法。

感觉优化的关键点在：数组里的数大小限制在 1 到 n 之间，以及每个数只会出现 0、1、2
次。

### 看完 Discuss 后...

对关键点的判断是对的，但我往交换方向想的...Discuss 里的解法是，for 循环数组每到一个元素，将元素值的绝对值 -1 作为索引找到数组对应元素，若为正数则乘一个 -1，若为负说明之前已经出现过一次，放入 list 中。

嗯...巧妙的用了一个负数解决问题...

用 Python 将这个算法实现了，练练手。