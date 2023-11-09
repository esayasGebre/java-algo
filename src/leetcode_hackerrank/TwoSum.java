package leetcode_hackerrank;

import java.util.HashMap;
import java.util.Map;

class TwoSum {

	public static void main(String[] args) {
		int[] arr = twoSum(new int[] { 2, 7, 11, 15 }, 9);
		System.out.println(arr[0] + "***" + arr[1]);

		arr = twoSum(new int[] { 2, 12, 11, 7 }, 9);
		System.out.println(arr[0] + "***" + arr[1]);

		arr = twoSum(new int[] { 21, 7, 2, 15 }, 9);
		System.out.println(arr[0] + "***" + arr[1]);
	}

	public static int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	    }
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            return new int[] { i, map.get(complement) };
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
}