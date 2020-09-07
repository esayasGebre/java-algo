package ja.problems.sortsearch.arr;

class Search {
	/**
	 * 
	 */
	private int[] anArray;

	
	/**
	 * anArray is a sorted array
	 * @param anArray
	 */
	Search(int[] anArray){
		this.anArray = anArray;
	}

	
	/**
	 * search a sorted array
	 * @param val
	 * @return
	 */
	boolean search(int val) {
		return recurse(0,anArray.length-1, val);
	}


	/**
	 * 
	 * @param a
	 * @param b
	 * @param val
	 * @return
	 */
	boolean recurse(int a, int b, int val) {
		int mid = (a+b)/2;
		if(anArray[mid] == val) return true;
		if(a > b) return false;
		if(val > anArray[mid]) return recurse(mid+1, b, val);
		else return recurse(a ,mid-1,val);
	}
}
	