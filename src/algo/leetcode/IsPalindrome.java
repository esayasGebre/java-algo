package algo.leetcode;

public class IsPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(0));
		System.out.println(isPalindrome(11));
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(777));
		System.out.println(isPalindrome(12021));
		System.out.println(isPalindrome(12345));
	}

	public static boolean isPalindrome(int x) {
		
		if (x <0) return false;
		
		Integer xx = x;
		char[] charArray = xx.toString().toCharArray();
		
		if (charArray.length == 1) return true;
		
		int rightIn = charArray.length-1;
		int leftIn = 0;
		while (rightIn >= leftIn) {
			if (charArray[leftIn] == charArray[rightIn]){
				++leftIn; 
				--rightIn;
			} else {
				return false;
			}
		}
		return  true;
	}

}
