package leetcode_hackerrank;

	import java.util.*;
	
	public class GradingStudent {

	    static int[] solve(int[] grades){
	        // Complete this function
	        for(int i=0; i< grades.length ; i++){
	            if(grades[i] >= 38){
	                int dif = 5 - (grades[i] % 5);
	                if(dif < 3) grades[i] = grades[i] + dif;
	            }
	        }
	        return grades;
	        
	    }

	    public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
	        System.out.println("number of students: ");
	        int n = in.nextInt();
	        int[] grades = new int[n];
	        for(int grades_i=0; grades_i < n; grades_i++){
	        	System.out.println("Enter grade:");
	            grades[grades_i] = in.nextInt();
	        }
	        int[] result = solve(grades);
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
	        }
	        System.out.println("");
	        

	    }
	}

