package SetMatrixZeroes;

import java.util.LinkedList;

class Solution {
    class Pair{
    int x;
    int y;
    public Pair(int y, int x){
        this.x=x;
        this.y=y;
    }
}
    public void setZeroes(int[][] matrix) {
        LinkedList<Pair> list = new LinkedList<>();
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0)
                    list.offer(new Pair(i,j));
            }
        
        for(Pair p : list){
            int x=p.x;
            int y=p.y;
            for(int i=0;i<matrix[0].length;i++)
                matrix[y][i]=0;
            for(int j=0;j<matrix.length;j++)
                matrix[j][x]=0;
        }
        
    }
}
