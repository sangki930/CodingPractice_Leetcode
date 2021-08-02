package TwoSum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int len = nums.length;
        if (len == 2) return new int[]{0, 1};
        int k = len -1;
        
        for (int i =0; i < len/2; i++) {
            for (int j = i+1; j < len -i; j++) {
                int needed = target -nums[j];
                if (nums[i] == needed) return new int[]{i, j};
                if (j != k && nums[k] == needed) return new int[]{j, k};
            }
            k--;
        }
        return new int[0];
        
    }
    public int[] twoSum2(int[] nums, int target) {
       
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++)
        {
            int value = target - nums[i];
            if(map.containsKey(value))
            {
                return new int[]{map.get(value), i};
            }
            map.put(nums[i], i);
        }
        
        return new int[]{-1, -1};
    }
}
