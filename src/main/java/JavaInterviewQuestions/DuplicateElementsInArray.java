package JavaInterviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		String names[] = {"c","C#","Java","Ruby","Perl","Php","Java", "C#"};
		
//		1. Compare each element: O(n*n) --- Worst solution 
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])){
					System.out.println("The duplicate element is: "+names[i]);
				}
			}
		}
		
		System.out.println("************************************");
		
//		2. Using Hashset: Java collection: It stores unique values
		Set<String> store = new HashSet<String>();
		
		for(String name : names){
			if(store.add(name)==false) {
				System.out.println("The duplicate element is: "+name);
			}
		}
		
		System.out.println("************************************");
		
//		3. Using HasMap
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		
		for(String name:names) {
			Integer count = storeMap.get(name);
			if(count==null) {
				storeMap.put(name, 1);
			}else {
				storeMap.put(name, ++count);
			}			
		}
		
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for(Entry<String, Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				System.out.println("The duplicate element is: "+entry.getKey());				
			}
		}		
	}
}
