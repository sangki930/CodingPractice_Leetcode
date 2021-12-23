package Course_Schedule_II;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        HashMap<Integer, ArrayList<Integer>> adj = new HashMap<>();
        int[] inDegree = new int[numCourses];
        for ( int t[]: prerequisites ) {
            ArrayList<Integer> list = adj.getOrDefault(t[1], new ArrayList<Integer>());
            list.add(t[0]);
            adj.put(t[1], list);
            inDegree[t[0]]++;
        }
		
        Queue<Integer> queue = new LinkedList<>();
        for ( int i=0; i<numCourses; i++ ) {
            if ( inDegree[i]==0 ) {
                queue.offer(i);
            }
        }
		
        if ( queue.isEmpty() ) {
            return new int[] {};
        }
        int[] res = new int[numCourses];
        int k = 0;
        while ( !queue.isEmpty() ) {
            int curr = queue.poll();
            res[k++] = curr;
            if ( adj.containsKey(curr) ) {
                for ( int j: adj.get(curr) ) {
                    inDegree[j]--;
                    if ( inDegree[j]==0 ) {
                        queue.offer(j);
                    }
                }
            }
        }
		
        return k==numCourses ? res : new int[] {};
    }
}