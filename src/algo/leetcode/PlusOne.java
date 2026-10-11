package algo.leetcode;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int[] plusOne = plusOne(new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 });
		
		System.out.println(Arrays.toString(plusOne));
	}

	public static int[] plusOne(int[] digits) {

		for (int i = digits.length - 1; i >= 0; i--) {
			// if the last element value is !=9 simply add +1 to the value and return
			if (digits[i] != 9) {
				digits[i] += 1;
				return digits;
			} else {
				// the val of index i will be 0 then teh loop will continue...
				digits[i] = 0;
			}
		}

		// then here we gonna create new array length + 1
		int[] arr = new int[digits.length + 1];
		arr[0] = 1;
		return arr;
	}

}
