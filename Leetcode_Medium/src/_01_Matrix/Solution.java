package _01_Matrix;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    final int[][] dirs = {{0, 1},{1, 0},{0, -1},{-1, 0}};
    
    public int[][] updateMatrix(int[][] matrix) {
        int col = matrix.length;
        int row = matrix[0].length;
        boolean[][] visit = new boolean[col][row];
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<col; i++) {
            for(int j=0; j<row; j++) {
                if(matrix[i][j] == 0) {
                    visit[i][j] = true;
                    queue.add(new int[]{i, j});
                }
            }
        }
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size-- > 0) {
                int[] cur = queue.poll();
                int curX = cur[0];
                int curY = cur[1];
                for(int[] dir : dirs) {
                    int nextX = curX + dir[0];
                    int nextY = curY + dir[1];
                    if(isNotRange(nextX, nextY, col, row)) continue;
                    if(visit[nextX][nextY]) continue;     
                    queue.add(new int[] {nextX, nextY});
                    visit[nextX][nextY] = true;
                    matrix[nextX][nextY] = matrix[curX][curY] + 1;
                }
            }
        }
        
        return matrix;
    }
    
    boolean isNotRange(int x, int y, int col, int row) {
        return (x < 0 || y < 0 || x >= col || y >= row ? true : false);
    }
}