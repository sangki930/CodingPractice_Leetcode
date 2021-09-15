package LongestTurbulentSubarray;

public class Solution {
    public int maxTurbulenceSize(int[] arr) {
        
        if(arr.length==1)
            return 1;
        
        int n = arr.length;
        int answer=1;
        int anchor=0;
        for(int i=1;i<n;i++){
            int c = Integer.compare(arr[i-1],arr[i]);
            if(c==0){
                anchor=i;
            }else if(i==n-1 || c*Integer.compare(arr[i],arr[i+1])!=-1){
                answer=Math.max(answer,i-anchor+1);
                anchor=i;
            }
        }
        
        return answer;
    }
}
