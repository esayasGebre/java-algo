package leetcode_hackerrank;

// SPINS_StringReverse 

import java.util.Scanner;

public class SPINSStringReverse {

	String stringToReverse;

	public SPINSStringReverse(String input) {
		stringToReverse = input;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		SPINSStringReverse solution = new SPINSStringReverse(input);
		solution.reverse();

		System.out.println(solution.stringToReverse);
		String[] arr = solution.stringToReverse.split(" ");
		for (int j = arr.length - 1; j >= 0; j--) {
			String str = arr[j];
			solution.stringToReverse = str;
			solution.reverse();
			System.out.print(solution.stringToReverse + " ");
		}
		System.out.println();
		in.close();
	}

	public void reverse() {
		int length = stringToReverse.length(), last = length - 1;
		char[] chars = stringToReverse.toCharArray();

		for (int i = 0; i < length / 2; i++) {
			char c = chars[last - i];
			chars[last - i] = chars[i];
			chars[i] = c;
		}

		stringToReverse = String.copyValueOf(chars);
		// return stringToReverse;
	}

}
