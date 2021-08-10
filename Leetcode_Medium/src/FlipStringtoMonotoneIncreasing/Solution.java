package FlipStringtoMonotoneIncreasing;

class Solution {
    public int minFlipsMonoIncr(String S) {
        int left=0;
        int right=S.length()-1;
        int zero[]=new int[200001];
        
        if(S.charAt(0)=='0') zero[0]=1;
        else zero[0]=0;
        for(int i=1;i<S.length();i++){
            if(S.charAt(i)=='1') zero[i]=zero[i-1];
            else zero[i]=zero[i-1]+1;
        }
        
        int res=zero[S.length()-1];
        for(int i=0;i<S.length();i++){
            int leftside=(i+1)-zero[i];
            int rightside=zero[S.length()-1]-zero[i];
            res=Math.min(res,leftside+rightside);
        }
        return res;
    }
}