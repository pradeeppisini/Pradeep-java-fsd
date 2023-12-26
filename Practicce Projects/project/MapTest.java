package Maps;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class MapTest {

    public static void main(String[] args) {

        // Create maps
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Insert values into maps
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);

        // Test values
        System.out.println("HashMap values:");
        System.out.println(hashMap.get("One"));
        System.out.println(hashMap.get("Two"));
        System.out.println(hashMap.get("Three"));

        System.out.println("\nTreeMap values:");
        System.out.println(treeMap.get("One"));
        System.out.println(treeMap.get("Two"));
        System.out.println(treeMap.get("Three"));

        System.out.println("\nLinkedHashMap values:");
        System.out.println(linkedHashMap.get("One"));
        System.out.println(linkedHashMap.get("Two"));
        System.out.println(linkedHashMap.get("Three"));
    }
}