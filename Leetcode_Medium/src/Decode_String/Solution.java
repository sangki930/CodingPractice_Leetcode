package Decode_String;

public class Solution {
	
	public String decodeString(String s) {
		int i=0;
		
		StringBuilder decodedStr = new StringBuilder();
		while(i<s.length() && s.charAt(i)!=']') {
			if (Character.isDigit(s.charAt(i))) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + Character.getNumericValue(s.charAt(i));
                    i++;
                }
                i++; // skip '['
                String strToRep = decodeString(s);
                while (num > 0) {
                    decodedStr.append(strToRep);
                    num--;
                }
                i++; // skip ']'
            } else {
                decodedStr.append(s.charAt(i));
                i++;
            }
		}
		return decodedStr.toString();
	}

}
