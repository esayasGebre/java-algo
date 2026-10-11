package algo.corejava;

/**
 * Demonistration of the 
 */
public class StaticDataMemberOfaClass {

	public static void main(String[] args) {

		new Person();
		System.out.println(Person.totalNumberOfPersonAttended);

		new Person();
		System.out.println(Person.totalNumberOfPersonAttended);
		
		new Person();
		System.out.println(Person.totalNumberOfPersonAttended);
		
		new Person();
		System.out.println(Person.totalNumberOfPersonAttended);
	}

}

class Person {

	int id;
	String name;
	static int totalNumberOfPersonAttended = 0;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person() {
		System.out.println("new instance of a person class is created.");
		++totalNumberOfPersonAttended;
	}

}