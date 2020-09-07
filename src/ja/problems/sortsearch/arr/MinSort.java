package ja.problems.sortsearch.arr;

public class MinSort {
	String[] strArr;

	MinSort(String[] strArr) {
		this.strArr = strArr;
	}

	public void sort() {
		if (strArr == null || strArr.length <= 1)
			return;
		int len = strArr.length;
		for (int i = 0; i < len; ++i) {
			int nextMinPos = minpos(i, len - 1);
			swap(i, nextMinPos);
		}

	}

	void swap(int i, int j) {
		String temp = strArr[i];
		strArr[i] = strArr[j];
		strArr[j] = temp;

	}

	// find minimum of arr between the indices bottom and top
	public int minpos(int bottom, int top) {
		String m = strArr[bottom];
		int index = bottom;
		for (int i = bottom + 1; i <= top; ++i) {
			int isE = strArr[i].compareTo(m); // compareTo
			if (isE == -1) {
				m = strArr[i];
				index = i;
			}
		}
		// return location of min, not the min itself
		return index;
	}

	/*
	 * public String toString(){ StringBuilder sb = new StringBuilder("["); for(int
	 * i = 0; i < strArr.length-1; ++i){ sb.append(strArr[i]+", "); }
	 * sb.append(strArr[strArr.length-1]+"]"); return sb.toString(); }
	 */

	public static void main(String[] args) {

		String s[] = { "big", "small", "tall", "short", "round", "square", "enormous", "tiny", "gargantuan",
				"lilliputian", "numberless", "none", "vast", "miniscule" };
		// Arrays.sort(s);
		// System.out.println(s[0]);
		MinSort str = new MinSort(s);
		str.sort();
		// System.out.println(str);
		/*
		 * int[] test = {21,13,1,-22, 51, 5, 18}; MinSort ss = new MinSort(test);
		 * ss.sort(); System.out.println(test[3]);
		 * 
		 * Search srch=new Search(test); System.out.println(srch.search(3));
		 */

	}
}