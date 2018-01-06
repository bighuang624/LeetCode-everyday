// Source : https://leetcode.com/problems/employee-importance/
// Author : Kyon Huang
// Date   : 2018-01-06

/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    Map<Integer, Employee> map = new HashMap<Integer, Employee>();
    
    public int getImportance(List<Employee> employees, int id) {  
        for(Employee em : employees)
            map.put(em.id, em);
        return getResult(id);
    }
    
    private int getResult(int id) {
        Employee boss = map.get(id);
        int value = boss.importance;
        for(int newId : boss.subordinates)
            value += getResult(newId);
        return value;
    }
}