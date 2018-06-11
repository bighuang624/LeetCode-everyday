// Source : https://leetcode.com/problems/keys-and-rooms/
// Author : Kyon Huang
// Date   : 2018-06-11

class Solution {
    
    boolean[] openRooms;
    
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        openRooms = new boolean[rooms.size()];
        DFS(rooms, 0);
        for(boolean flag : openRooms)
            if(!flag)
                return false;
        return true;
    }
    
    private void DFS(List<List<Integer>> rooms, int num) {
        openRooms[num] = true;
        List<Integer> curRoom = rooms.get(num);
        for(int key : curRoom) 
            if(!openRooms[key])
                DFS(rooms, key);
    }
}