package ja.core;

class Core1 {
	public int x=100;
	public static void main(String[] args) {
		Core1 c = new Core1();
		c.message();
	}
	void message(){
		System.out.println("message!");
	}
}

final class C {
	public double salary(){
		return 309.89;
	}
}