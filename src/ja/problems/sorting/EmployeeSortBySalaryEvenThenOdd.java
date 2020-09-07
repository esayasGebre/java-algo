package ja.problems.sorting;

import java.util.Comparator;

public class EmployeeSortBySalaryEvenThenOdd implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		double s1 = o1.getSalary();
		double s2 = o2.getSalary(); 
		
		if(s1%2 == s2%2 ){
			if(s1 % 2 == 0)
				return Double.compare(s1, s2);
			else 
				return Double.compare(s2, s1);
		}
			
		
		if(s1 % 2 == 0)
			return -1;
		else 
			return 1;
	}

}
