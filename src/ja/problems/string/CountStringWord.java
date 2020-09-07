package ja.problems.string;

public class CountStringWord {

	public static void main(String[] args) {
		CountStringWord cs = new CountStringWord();
		String s = "Volatile variable are visible by all threads";
		System.out.println("the number of words are: " + cs.countStringWord(s));

	}
	
	public int countStringWord(String str){
		if(str == null || str.isEmpty())
			return 0;
		
		String[] strArray = str.split(" ");
		return strArray.length;
	}

}
