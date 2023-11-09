package leetcode_hackerrank;
import java.util.Scanner;



public class SparseArrays {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in = new Scanner(System.in);
	        
	        //System.out.println("Number of strings: ");
	        int N = in.nextInt();
	        in.nextLine();
	        String[] str = new String[N];
	        for(int i=0;i<N;i++){
	           // System.out.println("Enter String:");
	            String x=in.nextLine();
	            str[i]=x;
	        }
	        //System.out.println("-----------------");
            // System.out.println("Number of query: ");
	        int Q = in.nextInt();
            in.nextLine();
	        int counter=0;
	        String q="";
	        int [] re = new int[Q];
	        for(int i=0;i<Q;i++){
	            //System.out.println("Enter string Query "+(i+1)+" :");
	            q=in.nextLine();
	            
	            for(int j=0;j<N;j++){
	                if(str[j].equals(q))
	                    counter++;
	            }
	            re[i]=counter;
	            counter = 0;
	        }
	        
	        for(int n:re){
	            System.out.println(n);
	        }
	        
	        in.close();
    }
}