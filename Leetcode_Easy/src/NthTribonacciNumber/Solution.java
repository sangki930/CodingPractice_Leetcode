package NthTribonacciNumber;

public class Solution {
    
    int dp[]=new int[38];
    
    public int fibo(int n){
        
       switch(n){
           case 0:
               return dp[0]=0;
           case 1:case 2:
               return dp[n]=1;
        default:
            if(dp[n]!=0)
                return dp[n];
            return dp[n]=fibo(n-1)+fibo(n-2)+fibo(n-3);
       } 
    }
    
    public int tribonacci(int n) {
        return fibo(n);
    }
}
