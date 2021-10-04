package IslandPerimeter;

public class Solution {
    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == 1)
                {
                    ans = ans + 4 
                        - (i == grid.length-1? 0: grid[i+1][j])
                        - (i == 0? 0: grid[i-1][j])
                        - (j == 0? 0: grid[i][j-1])
                        - (j == grid[0].length-1? 0: grid[i][j+1]);
                }
                
            }
        }
        
        return ans;
    }
}
