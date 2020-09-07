package ja.designpattern.comparator;

import java.util.Comparator;

//1,implementation of SalaryComparator
public class SalaryComparator implements Comparator<Employee>{
	
	public int compare(Employee e1, Employee e2) {
		double salary1 = e1.getSalary();
		double salary2 = e2.getSalary();

        if(salary1 > salary2) {
			return 1;
		}
		else 
			return -1;
	}
}
