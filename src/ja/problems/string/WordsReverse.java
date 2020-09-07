package ja.problems.string;

/*
 * 
 */
public class WordsReverse {

	public static void main(String[] args) {
		WordsReverse wr = new WordsReverse();
		String str = "system is not working. unknown error!";
		System.out.println(wr.revWord(wr.wordReverse(str)));

	}

	/*
	 * 
	 */
	public String wordReverse(String str) {

		char[] strAsCh = str.toCharArray();
		int l = 0;
		int r = strAsCh.length - 1;

		while (l < r) {

			char temp = strAsCh[l];
			strAsCh[l] = strAsCh[r];
			strAsCh[r] = temp;
			l++;
			r--;
		}

		return String.valueOf(strAsCh);
	}

	public String revWord(String result) {
		for (String word : result.split(" ")) {
			result = result.replaceAll(word, wordReverse(word));
		}
		return result;
	}

}
