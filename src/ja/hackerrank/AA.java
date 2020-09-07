package ja.hackerrank;

public class AA {
	/*
	 * Complete the function below.
	 */
public static void main(String [] args){
/*	int [] a = {4,5,6,7};
	findNumber (a, 4);
}
	    static String findNumber(int[] arr, int k) {
	        List<Integer> arList = Arrays.asList(arr);
	        if(arList.contains(k)) 
	            return "YES";
	        else return "NO";

	    }*/
	System.out.println();
	oddNumbers(2,5);
}
	  static void oddNumbers(int l, int r) {
		  int size = (r-l)/2 +1 ;
	        int i=0;
	        int[] arr = new int[size];
	        for(;l<=r;l++){
	            if(l%2==1){
	            	arr[i]=l;
	            	i++;
	            }
	        }
	        for(int j=0;j<arr.length;j++)
	        	System.out.println(arr[j]);

	    }
}
