package ComplexNumberMultiplication;

class Solution {
	public String complexNumberMultiply(String num1, String num2) {

		int realPart = 0;
		int complexPart = 0;
		int[] splitA = helper(num1);
		int[] splitB = helper(num2);
		realPart = splitA[0] * splitB[0] - splitA[1] * splitB[1];
		complexPart = splitA[0] * splitB[1] + splitA[1] * splitB[0];
		return realPart + "+" + complexPart + "i";
	}

	private int[] helper(String s) {
		String[] strs = s.split("\\+");
		int[] arr = new int[2];
		arr[0] = Integer.parseInt(strs[0]);
		arr[1] = Integer.parseInt(strs[1].substring(0, strs[1].indexOf('i')));
		return arr;
	}
}
