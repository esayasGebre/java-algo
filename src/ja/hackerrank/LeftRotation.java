package ja.hackerrank;

import java.util.Scanner;

public class LeftRotation {

    static int[] leftRotation(int[] a, int d) {
        // Complete this function
    	int c = 0;
    	while(c!=d){
    		int ro = a[0];
    		for(int j=0;j<a.length-1;j++){
    			a[j]=a[j+1];
    		}
    		a[a.length-1]=ro;
    		c=c+1;
    	}
    	return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");

        in.close();
    }
}
