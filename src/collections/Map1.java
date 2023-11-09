package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Map1 {

	public static void main(String[] args) {
		Map<Integer, String> hashTable = new Hashtable<>();
		//Map<Integer, String> hashTable = new HashMap<>(5)
		hashTable.put(1, "sara");
		hashTable.put(22, "null");
		hashTable.put(10, "Jon");
		hashTable.put(11, "v");
		hashTable.put(20, "miki");
		hashTable.put(25, "null");
		hashTable.put(30, "Toni");
		
		List<String> li = new ArrayList<>(hashTable.values());
		Iterator<String> it = li.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		Map<Integer, String> synMap = Collections.synchronizedMap(hashTable);
		
		Map<Integer, String> conccurentMap = new ConcurrentHashMap<>(hashTable);
		
		System.out.println(synMap);
		System.out.println(conccurentMap);
	}
}
