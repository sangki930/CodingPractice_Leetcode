package ClimbStairs;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int counter[]=new int[100001];
        LinkedList<Integer> list = new LinkedList<>();
        
        for(int i=0;i<nums.length;i++){
            if(counter[nums[i]]==0)
                counter[nums[i]]++;
            else if(counter[nums[i]]>0)
                list.offer(nums[i]);
        }
        return list;
    }
}