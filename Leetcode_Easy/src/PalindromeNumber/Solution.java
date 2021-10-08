package PalindromeNumber;

public class Solution {
	public boolean isPalindrome(int x) {
        if(x>=0){
            
            StringBuilder sb = new StringBuilder(x+"");
            if(sb.reverse().toString().equals(x+""))
                return true;
            
        }
        return false;
    }
}
