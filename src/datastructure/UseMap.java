package datastructure;
import java.util.HashMap;
import java.util.Map;
public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, databases.MySql] to store data and retrieve data.
		 */
		Map<String, Integer> map = new HashMap<>();
		map.put("Alice", 21);
		map.put("Bob", 25);
		map.put("Charlie", 30);

		// retrieve the value for a key using the get() method
		Integer age = map.get("Alice");
		System.out.println("Age of Alice: " + age);

		// check if the Map contains a key using the containsKey() method
		boolean containsKey = map.containsKey("Alice");
		System.out.println("Map contains key 'Alice': " + containsKey);

		// check if the Map contains a value using the containsValue() method
		boolean containsValue = map.containsValue(30);
		System.out.println("Map contains value 30: " + containsValue);

		// retrieve the key-value pairs using the entrySet() method and a for-each loop
		System.out.println("\nKey-value pairs using a for-each loop:");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ": " + value);
		}
	}
	}


