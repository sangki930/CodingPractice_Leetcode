package MedianofTwoSortedArrays;

import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] dst = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,dst,0,nums1.length);
        System.arraycopy(nums2,0,dst,nums1.length,nums2.length);
        
        // System.out.println(Arrays.toString(dst));
        Arrays.sort(dst);
        if(dst.length%2==0){
            return ((double)dst[dst.length/2-1]+(double)dst[dst.length/2])/2;
        }
        
        return (double)dst[dst.length/2];
    }
}
