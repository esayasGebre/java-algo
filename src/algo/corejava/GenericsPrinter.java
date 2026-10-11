package algo.corejava;

public class GenericsPrinter {

	public static void main(String[] args) {
		print(100);
		print("String");
		print(10D);
		print(101d);

		// TODO... sum of any type....
		// double d = sum(9.1D,6.6D);
		// String s = sum("aida", " Abraha");
		// char c= sum('v','b');

	}

	public static <T> void print(T a) {
		System.out.println(a);
	}

}
