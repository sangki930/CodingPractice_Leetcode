package Merge_Intervals;

class Solution {
    public int[][] merge(int[][] intervals) {
        int l=intervals.length;
        if(l==1)
            return intervals;
        int count=0;
        for(int j=0;j<l;j++){
            boolean flag=true;
            while(flag){
                flag=false;
            if(intervals[j][0]!=-1)
                for(int i=j+1;i<l;i++){
                    if(intervals[i][0]!=-1 && intervals[j][1] >= intervals[i][0] && intervals[j][0] <= intervals[i][1]){
                        intervals[j][0]= Math.min(intervals[i][0],intervals[j][0]);
                        intervals[j][1]=Math.max(intervals[i][1],intervals[j][1]);
                        intervals[i][0]=-1;
                        count++;
                        flag=true;
                    }
                }
            }
        }
        int[][] res=new int[l-count][2];
        int i=0;
        for(int[] arr: intervals)
            if(arr[0]!=-1){
                res[i]=arr;
                i++;
            }
        return res;
    }
}