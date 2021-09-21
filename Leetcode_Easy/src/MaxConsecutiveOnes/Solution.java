package MaxConsecutiveOnes;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt=nums[0]==1?1:0;
        int answer=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==1 && nums[i-1]==1){
                cnt++;
            }
            else if(nums[i]==1 && nums[i-1]==0)
                cnt=1;
            else if(nums[i]==0){
                answer=Math.max(cnt,answer);
                cnt=0;
            }
        }
        return answer=Math.max(cnt,answer);
    }
}