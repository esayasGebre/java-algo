package ja.designpattern.comparator;
//list

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {
	
	public static void main(String[] args) {
		new EmployeeSort();

	}
	public EmployeeSort() {
		Employee[] empArray =
			{new Employee("George", 40000, 1996,11,5),
			 new Employee("Dave", 50000, 2000, 1, 3),
			 new Employee("Richard", 45000, 2001, 2, 7)};
		List<Employee> empList = Arrays.asList(empArray);//an arrays as list to list of employee
	
		//3, additional code in the EmployeeSort constructor 
		NameComparator nameComp = new NameComparator();
		Collections.sort(empList, nameComp);
		System.out.println(empList);
		System.out.println("---------sorted by salary---------------------------");
		SalaryComparator salaryComp = new SalaryComparator();
		Collections.sort(empList, salaryComp);
		System.out.println(empList);
		System.out.println("---------sorted by HireDate ---------------------------");
		HireDateComparator hiredComp=new HireDateComparator();
		Collections.sort(empList, hiredComp);
		System.out.println(empList);
		//EmployeeSort e=new EmployeeSort();
		//System.out.println("\n\n\n...." + e.hashCode());
		//...-1874243739....1311053135
	}

}

