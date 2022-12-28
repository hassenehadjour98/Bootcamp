package datastructure;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Deque<String> queue = new ArrayDeque<>();

		// add elements to the queue
		queue.add("Apple");
		queue.add("Banana");
		queue.add("Orange");

		// peek at the first element using the peek() method (no remove)
		String first = queue.peek();
		System.out.println("First element: " + first);

		// remove the first element using the remove() method
		String removed = queue.remove();
		System.out.println("Removed element: " + removed);

		// poll the first element using the poll() method (no exception)
		String polled = queue.poll();
		System.out.println("Polled element: " + polled);

		// retrieve the elements using a for-each loop
		System.out.println("Retrieving elements using a for-each loop:");
		for (String element : queue) {
			System.out.println(element);
		}
		System.out.println("Retrieving elements using a while loop and an Iterator:");
		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
	}

}
