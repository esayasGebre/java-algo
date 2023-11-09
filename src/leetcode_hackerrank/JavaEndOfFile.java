package leetcode_hackerrank;

import java.io.File;
import java.util.Scanner;

public class JavaEndOfFile {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		try {
			//System.out.print("Enter the file name with extension : ");
			Scanner input = new Scanner(System.in);
			//File file = new File(input.nextLine());
			File file = new File("D:\\doc.txt");
			input.close();
			input = new Scanner(file);
			// Scanner input = new Scanner(System.in);
			int count = 0;
			while (input.hasNext()) {
				count += 1;
				System.out.println(count + " " + input.nextLine());
			}
			input.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
