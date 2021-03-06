package PerfectSquares;

import java.util.Arrays;

public class Solution {
	public int numSquares(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        if(n>=0&&n<=3)
            return n;
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        for(int i=4;i<=n;i++){
            for(int j=1;j<=(int)Math.sqrt(i);j++){
                dp[i]=Math.min(dp[i],1+dp[i-j*j]);
            }
        }
        return dp[n];
    }
}
