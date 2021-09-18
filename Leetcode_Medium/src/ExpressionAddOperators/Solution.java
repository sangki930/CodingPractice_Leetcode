package ExpressionAddOperators;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    LinkedList<String> ans;
    static int n;
    static String num;
    static int target;
    public List<String> addOperators(String nu, int tar) {
        n = nu.length();num=nu;target=tar;
        ans = new LinkedList<>();
        backTrack(0,0,0,0L,"");
        return ans;
    }
    
    public void backTrack(int index, long pre, long cur, long value, String s){
        if(index==n){
            if(value==target && cur == 0 ){
                ans.offer(s);
            }
            return ;
        }
        // System.out.println(num);
        cur = cur*10+(num.charAt(index)-'0');
        
        if(cur>0)
            backTrack(index+1, pre,cur,value,s);
        if(s.isEmpty())
            backTrack(index+1,cur,0,value+cur,""+(cur));
        else{
            backTrack(index+1,cur,0,value+cur,s+'+'+(cur));
            backTrack(index+1,-cur,0,value-cur,s+'-'+(cur));
            backTrack(index+1,pre*cur,0,value-pre+pre*cur,s+'*'+(cur));
        }
    }
}
