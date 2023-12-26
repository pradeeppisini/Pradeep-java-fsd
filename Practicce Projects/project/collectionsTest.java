package Collections;
import java.util.*;
public class collectionsTest {
	 public static void main(String[] args) {
	        // Testing ArrayList
	        List<String> arrayList = new ArrayList<>();
	        arrayList.add("Element 1");
	        arrayList.add("Element 2");
	        System.out.println("ArrayList: " + arrayList);

	        // Testing HashSet
	        Set<String> hashSet = new HashSet<>();
	        hashSet.add("Element 1");
	        hashSet.add("Element 2");
	        hashSet.add("Element 1"); // This should not be added as sets do not allow duplicate elements
	        System.out.println("HashSet: " + hashSet);

	        // Testing HashMap
	        Map<String, String> hashMap = new HashMap<>();
	        hashMap.put("Key 1", "Value 1");
	        hashMap.put("Key 2", "Value 2");
	        System.out.println("HashMap: " + hashMap);
	    }
	}
