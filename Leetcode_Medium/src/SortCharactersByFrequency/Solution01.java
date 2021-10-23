package SortCharactersByFrequency;

import java.util.ArrayList;
import java.util.List;

public class Solution01 {
	
	public String solution(String s) {
        final int n = s.length();
        int[] count = new int[128];
        List<Character>[] bucket = new List[n+1];
        
        for(char c: s.toCharArray())
            ++count[c];
        
        for(int i = 0; i < 128; i++) {
            int freq = count[i];
            if (freq > 0) {
                if (bucket[freq] == null)
                    bucket[freq] = new ArrayList<>();
                bucket[freq].add((char)i);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int freq = n; freq > 0; --freq)
            if (bucket[freq] != null) {
                for(char c: bucket[freq]) {
                    for(int i = 0; i < freq; i++)
                        sb.append(c);
                }
            }
        return sb.toString();
	}

}
