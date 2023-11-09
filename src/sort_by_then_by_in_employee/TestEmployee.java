package sort_by_then_by_in_employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {
	public static void main(String[]args){
		Employee p1 = new Employee(1,"esa","go",95000);
		Employee p2 = new Employee(2,"sara","biru",72000);
		Employee p3 = new Employee(6,"abel","abrha",5000);
		Employee p4 = new Employee(4,"natna","gebre",6000);
		Employee p5 = new Employee(5,"abel","Tesfay",200);
		Employee p6 = new Employee(3,"natna","Robert",7500);
	
		//ArrayList...
		List<Employee> aList = new ArrayList<>();
		aList.add(p1); aList.add(p2); aList.add(p3); aList.add(p4);
		aList.add(p5); aList.add(p6);
		System.out.println("Class Name is: " 
			+ aList.get(0).getClass().getSimpleName());	
		
		Iterator<Employee> empIt = aList.listIterator();
		
		System.out.println("\nBefor SORT:__________ ");
		while(empIt.hasNext())
		{
			System.out.println(empIt.next());
		}
		
		Collections.sort(aList);
		empIt = aList.iterator();
		System.out.println("\nCOMPARABLE after SORT by firstName::_________ ");
		while(empIt.hasNext())
		{
			System.out.println(empIt.next());
		}
		//EmployeeSortByNameThenSalary sortByNameSalay = new EmployeeSortByNameThenSalary();
		//Collections.sort(aList, sortByNameSalay); 
		Collections.sort(aList, new EmployeeSortByNameThenSalary());
		empIt = aList.iterator();
		System.out.println("\nCOMPARATOR after SORT by firstName then by Salary:_________ ");
		while(empIt.hasNext())
		{
			System.out.println(empIt.next());
		}
		

		Collections.sort(aList, new EmployeeSortBySalaryEvenThenOdd());
		empIt = aList.iterator();
		System.out.println("\nCOMPARATOR after SORT by salary even then Odd:_________ ");
		while(empIt.hasNext())
		{
			System.out.println(empIt.next());
		}
		
		
		Collections.sort(aList, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getId(), o2.getId());
			}
		});
		
		empIt = aList.iterator();
		System.out.println("\nCOMPARATOR after SORT by salary even then Odd:_________ ");
		while(empIt.hasNext())
		{
			System.out.println(empIt.next());
		}
	}
}
