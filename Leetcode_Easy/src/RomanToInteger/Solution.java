package RomanToInteger;

public class Solution {
    public int romanToInt(String s) {
        if (s.length() == 0 || s == null) {
            return 0;
        }
        char[] chars = s.toCharArray();
        int sum = 0;
        for (int i = 0; i <= chars.length - 1; i++) {
            int curr = getValue(chars[i]);
            int next = i + 1 > chars.length - 1 ? 0 : getValue(chars[i + 1]);
            if (curr < next) {
                sum += next - curr;
                i++;
            } else {
                sum += curr;
            }
        }
        return sum;
    }
    
    public int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
