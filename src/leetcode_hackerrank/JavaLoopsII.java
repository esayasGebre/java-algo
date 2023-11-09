package leetcode_hackerrank;
import java.util.Scanner;

class JavaLoopsII{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            series(a, b, n);
        }
        in.close();
    }
    public static void series(int a, int b, int n){
        
        int []ar = new int[n];
        for(int i=0;i<n;i++){
          int s=a;
            for(int j=0;j<=i;j++){
                s = s + (int)(Math.pow(2,j)*b);
            }
            ar[i]= s;
        }
        for(int sr: ar){
            System.out.print(sr + " ");
        }
      System.out.println(); 
    }
}
