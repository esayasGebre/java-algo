package ja.hackerrank;

import java.util.Scanner;

public class JavaInitializedStaticBlock {

	   static Scanner scan = new Scanner(System.in);
	   static int B = scan.nextInt();
	   static int H = scan.nextInt();
	   static boolean flag;
	static{
	    if(B>=0 && H>=0)
	        flag = true;
	}
	
	public static void main(String [] args){
		if(flag){
			int area=B*H;
			System.out.println(area);
		}
	}
}