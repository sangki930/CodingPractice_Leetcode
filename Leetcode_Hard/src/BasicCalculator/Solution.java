package BasicCalculator;

import java.util.Stack;

public class Solution {

	public int calculate(String s) {
		int sum=0;
		int sign=1;
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))) {
				int num=0;
				while(i<s.length() && Character.isDigit(i)) {
					num = num*10+s.charAt(i)-'0';
					i++;
				}
				sum+=num*sign;
				i--;
			}else if(s.charAt(i) == '+'){
                sign = 1;
            }
            
            else if(s.charAt(i) == '-'){
                sign = -1;
            }
            
            else if(s.charAt(i) == '('){
                stack.push(sum);
                stack.push(sign);
                sign = 1;
                sum = 0;
            }
            
            else if(s.charAt(i) == ')'){
                sum = stack.pop() * sum;
                sum += stack.pop();
            }
		}
		return sum;
	}
}
