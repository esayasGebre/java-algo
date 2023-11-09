package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class CollectionsExample {

	public static void main(String[] args) {
		Employee p1 = new Employee(1,"esa","go",95000);
		Employee p2 = new Employee(2,"sara","biru",75000);
		Employee p3 = new Employee(3,"abel","abrha",95000);
		Employee p4 = new Employee(4,"natna","gebre",75000);
		//ArrayList...
		//1
		List<Employee> aList = Collections.synchronizedList(new ArrayList<>());
		//2
		//CopyOnWriteArrayList <Long> safeList = new CopyOnWriteArrayList<>();
		
		aList.add(p1); aList.add(p2); aList.add(p3); aList.add(p4);
		
		//this is perfectly right
		//vector is a synchronized(thread safe) form of arrayList
		//Vector<Employee> vec = new Vector<>(aList);
		Vector<Integer> v = new Vector<>(5,4);
		v.add(4);
		v.add(7);
		v.add(8);
		v.add(4);
		v.add(7);
		v.addElement(8);
		
		Stack<String> stack = new Stack<>();
		stack.push("me");
		stack.push("you");
		stack.push("and");
		String s =stack.peek();
		System.out.println(s);
		System.out.println(stack);
		System.out.println(stack.search("me"));
		
		System.out.println(v);
		System.out.println(v.get(2));
		System.out.println(v.size() + "  " + v.capacity());
		System.out.println(/*aList.lastIndexOf(p3) +*/ "Class Name is " 
			+ aList.get(0).getClass().getSimpleName());	
		Iterator<Employee> empIt = aList.listIterator();
		while(empIt.hasNext()){
			System.out.println(empIt.next() + " " );
		}
		
		//VECTOR...
		Vector<Integer> obj = new Vector<>(2,3);
		obj.addElement(new Integer(5));
		obj.removeAll(obj);
		System.out.println(obj.isEmpty());
	
		//STACK....
		Stack<Integer> ob = new Stack<>();
		ob.push(new Integer(3));
		ob.push(6);
		ob.pop();
		ob.add(10);
		int num = (int)ob.peek();
		System.out.println("value of num: " +num);
		System.out.println("stack elements " 
				+ob);
		System.out.println("____________________");
	}

}
