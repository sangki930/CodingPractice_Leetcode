package SortCharactersByFrequency;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
		// put every char with it frequency in the map
        s.chars().forEach(c -> map.put((char) c, map.getOrDefault((char) c, 0) + 1));
        return map.entrySet()
                .stream()
				// sort by value in desc order
                .sorted(Map.Entry.comparingByValue((o1, o2) -> -o1.compareTo(o2))) 
				// get char repeated by its frequency
                .map(entry -> String.valueOf(entry.getKey()).repeat(entry.getValue())) 
                .map(String::valueOf)
                .collect(Collectors.joining());
        

    }
}