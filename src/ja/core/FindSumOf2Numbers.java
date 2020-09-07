package ja.core;

import java.util.HashSet;
import java.util.Set;

public class FindSumOf2Numbers {

	public static void main(String[] args) {
		int[] arr = {1,6,2,8,3,10,5};
		int k= 10;
		System.out.println(checkout(arr,k));
	}

	private static boolean checkout(int[] arr, int k) {
		Set<Integer> unique = new HashSet<>();
		for(int num : arr){
			int d = k-num;
			if(unique.contains(d)){
				return true;
			}
			unique.add(num);
		}
		return false;
	}
}
