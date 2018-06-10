// Source : https://leetcode.com/problems/valid-parentheses/
// Author : Kyon Huang
// Date   : 2018-06-10

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char ch : s.toCharArray()) {
            switch(ch) {
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if(stack.isEmpty() || stack.peek() != '(')
                        return false;
                    else
                        stack.pop();
                    break;
                case ']':
                    if(stack.isEmpty() || stack.peek() != '[')
                        return false;
                    else
                        stack.pop();
                    break;
                case '}':
                    if(stack.isEmpty() || stack.peek() != '{')
                        return false;
                    else
                        stack.pop();
                    break;
                default:
                    return false;
            }
        }
        return stack.isEmpty();
    }
}