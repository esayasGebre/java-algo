package algo.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MajorityElement {
	
	public static void main(String[] args) {
		int majorityElement = majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 });

		System.out.println(majorityElement);
	}

	
    public static int majorityElement(int[] nums) {

        List<Integer> li = new ArrayList<>();

        //first I am going to find the sored list of arrays for that matter 
        //for the simplisity I am going to use the arrayList, I will add all the array 
        //elements to the arrayList li -li will store elements in the order of insertion
        // that means right now the list li is not sorted 
		for (int i=0;i< nums.length;i++) {
			li.add(nums[i]);
		}

        //I will sort the list, and find the mid element value, that will be the majority elements val
		Collections.sort(li);
		return li.get(li.size() / 2);
    }

}
