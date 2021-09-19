package DistinctSubsequences;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numDistinct(String s, String t) {
        if(s.equals(t)) return 1;
        if(s.length()==t.length()) return 0;
        
        int ans=0;
        HashMap<String,Integer>[] maps = new HashMap[s.length()];
        
        for(int i=0;i<s.length();i++){
            maps[i] = new HashMap<>();
            String key = s.charAt(i)+"";
            maps[i].put(key,1);
            if(key.equals(t)) ans++;
        }
        
        for(int i=1;i<maps.length;i++){
            for(int j=0;j<i;j++){
                for(Map.Entry<String,Integer> entry : maps[j].entrySet()){
                    String str = entry.getKey();
                    String newKey = str+s.charAt(i);
                    if(t.startsWith(newKey)){
                        int x = entry.getValue();
                        int y = maps[i].getOrDefault(newKey,0);
                        maps[i].put(newKey,x+y);
                        if(newKey.equals(t)) ans += x;
                    }
                }
            }
        }
        
        return ans;
    }
}
