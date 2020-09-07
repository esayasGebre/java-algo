package ja.leetcode;

import java.util.HashMap;
import java.util.Map;

class LongestSubstring {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		System.out.println(lengthOfLongestSubstring("bbbbb"));
		System.out.println(lengthOfLongestSubstring("pwwkew"));
		System.out.println(lengthOfLongestSubstring("dvdf"));
	}

	    public static int lengthOfLongestSubstring(String s) {
	        int currentCount=0;
	        int prevCount=0;
	        Map<Character, Integer> chs = new HashMap<>();
	        char[] charArr = s.toCharArray();
	        for (int i=0; i< charArr.length;i++){
	            char currChar = charArr[i];
				if(!chs.keySet().contains(currChar)) {
	            	chs.put(currChar, i);
	            	currentCount+=1;
	            } else {
	            	i = chs.get(currChar) + 1;
	            	chs.clear();
	            	chs.put(charArr[i], i);
	            	if(prevCount < currentCount) {
	            		prevCount=currentCount;
	            	}
	            	currentCount=1;
	            }
	        }
	        return currentCount > prevCount ? currentCount : prevCount;
	    }
	
}