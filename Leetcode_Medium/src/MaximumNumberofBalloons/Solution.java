package MaximumNumberofBalloons;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int maxNumberOfBalloons(String text) {

		Map<Character, Integer> map = new HashMap<>();
		int cnt1 = 0, cnt2 = 0;
		for (char c : text.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
			if (func(map)) {
				map.put('b', map.get('b') - 1);
				map.put('a', map.get('a') - 1);
				map.put('l', map.get('l') - 2);
				map.put('o', map.get('o') - 2);
				map.put('n', map.get('n') - 1);
				cnt1++;
			}
		}

		return cnt1;
	}

	public boolean func(Map<Character, Integer> map) {

		if (map.getOrDefault('b', 0) >= 1 && map.getOrDefault('a', 0) >= 1 && map.getOrDefault('l', 0) >= 2
				&& map.getOrDefault('o', 0) >= 2 && map.getOrDefault('n', 0) >= 1) {
			return true;
		}
		return false;
	}
}
