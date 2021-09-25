package JumpGameII;

public class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n==1) return 0;
        if(n==2) return 1;
        
        int farthest=0;
        int current=0;
        int jumps=0;
        
        for(int i=0;i<n-1;i++){
            int current_far=i+nums[i];
            if(current_far>farthest)
                farthest=current_far;
            if(i==current){
                current=farthest;
                jumps+=1;
            }
        }
            
        return jumps;
        
    }
}
