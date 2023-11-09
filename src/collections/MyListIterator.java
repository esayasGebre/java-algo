package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MyListIterator {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(2);
		li.add(4);
		li.add(5);
		li.add(6);
		li.add(7);
		ListIterator<Integer> liIt = li.listIterator();
		while(liIt.hasNext()){
			System.out.println(liIt.next());
			//li.add(7); // java.util.ConcurrentModificationException
		}
		//Arrays.fill(a, fromIndex, toIndex, val);
		while(liIt.hasPrevious()){
			System.out.println(liIt.previous());
		}
	}
}
