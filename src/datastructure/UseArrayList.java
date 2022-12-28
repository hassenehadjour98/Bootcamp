package datastructure;
import com.mysql.cj.MysqlConnection;

import java.util.ArrayList;
import java.util.Iterator;
public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		// create an ArrayList of Strings
		ArrayList<String> list = new ArrayList<>();

		// add elements to the list using the add() method
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");

		// retrieve the elements using a for-each loop
		System.out.println("Retrieving elements using a for-each loop:");
		for (String element : list) {
			System.out.println(element);
		}

// 		sort the list using the sort() method
//		list.sort();

		// retrieve the elements using a while loop and an Iterator
		System.out.println("Retrieving elements using a while loop and an Iterator:");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}

		// connect to the database and store the sorted list
		// (database connection code not shown)
		storeInDatabase(list);
	}

	private static void storeInDatabase(ArrayList<String> list) {
		// store the list in the database
		// (database storing code not shown)
//

	}
}


