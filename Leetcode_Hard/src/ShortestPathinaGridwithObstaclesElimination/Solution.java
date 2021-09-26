package ShortestPathinaGridwithObstaclesElimination;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int i;
    int j;
    int k;
    Node (int i, int j, int k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }
}
public class Solution {
    public int shortestPath(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        if (k >= m+n-2) {
            return m+n-2;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, 0, 0));
        int[][] kCount = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(kCount[i],Integer.MAX_VALUE);
        }
        kCount[0][0] = 0;
        int[][] dirs = new int[][]{{1,0}, {0,1},{-1,0}, {0,-1}};
        int steps = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                Node node = queue.poll();
                if (node.i == m-1 && node.j == n-1) {
                    return steps;
                }
                for (int[] dir: dirs) {
                    int ni = node.i + dir[0];
                    int nj = node.j + dir[1];
                    if (ni < 0 || nj < 0 || ni >= m || nj >= n)
                        continue;
                    int nK = node.k + grid[ni][nj];
                    if (nK >= kCount[ni][nj] || nK > k) 
                        continue;
                    kCount[ni][nj] = nK;
                    queue.add(new Node(ni, nj, nK));
                }
            }
            steps++;
        }
        return -1;
    }
}