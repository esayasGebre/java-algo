package ja.designpattern.comparator;

import java.util.Comparator;

import java.util.Date;
//2,implementation of HireDateComparator
public class HireDateComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {

		Date hireDate1 = e1.getHireDate();
		Date hireDate2 = e2.getHireDate();
		
		if(hireDate1.compareTo(hireDate2) == 1) {
			return 1;
		}else
			return -1;

	}
}
