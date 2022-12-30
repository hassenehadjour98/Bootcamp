package datastructure;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, databases.MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

//		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

		// specify the path to the text file
		Path filePath = Paths.get("user.dir" + "/src/data/self-driving-car.txt");

		// create a BufferedReader to read the file
		try (BufferedReader reader = Files.newBufferedReader(filePath)) {
			// read the file line by line
			String line;
			while ((line = reader.readLine()) != null) {
				// print each line to the console
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

//		***************************************************************

		MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

		MongoDatabase database = mongoClient.getDatabase("mydb");
		MongoCollection<Document> collection = database.getCollection("mycollection");

		Document document = new Document("name", "Alice")
				.append("age", 21)
				.append("location", "New York");

		collection.insertOne(document);

		Document retrievedDocument = collection.find().first();

		System.out.println(retrievedDocument);

		Stack<String> stack = new Stack<>();
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Orange");

		// retrieve and remove the top element using the pop() method
		String top = stack.pop();
		System.out.println("Popped element: " + top);

		// peek at the top element using the peek() method (no remove)
		String peek = stack.peek();
		System.out.println("Peeked element: " + peek);

		// search for an element using the search() method
		int index = stack.search("Apple");
		System.out.println("Index of element 'Apple': " + index);

		// retrieve the elements using a for-each loop
		System.out.println("\nRetrieving elements using a for-each loop:");
		for (String element : stack) {
			System.out.println(element);
		}





	}

}
