package datastructure;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) throws Exception {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */
		String line;

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";
		try {
			BufferedReader read = new BufferedReader(new FileReader(textFile));
			while ((line = read.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		String text = "";
		try {
			BufferedReader read = new BufferedReader(new FileReader(textFile));
			while ((line = read.readLine()) != null) {
				text += line + "\n";
				String[] words = text.split(" ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		Stack stack1 = new Stack<>();
		LinkedList list = new LinkedList<>();
		String[] words = text.split(" ");
		for (String word : words) {
			stack1.push(word);
			list.add(word);
		}


		System.out.println("THIS IS PRINTING VALUES FROM LINKEDLIST:");

		System.out.println(list);

		System.out.println("THIS IS LOOPING THROUGH THE LINKEDLIST:");

//		using for loop;
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		System.out.println("THIS IS PRINTING VALUES FROM THE STACK FROM LAST ELEMENT TO FIRST ELEMENT(LIFO):");
		for (int i = 0; i < stack1.size(); i++) {
			String str = (String) stack1.pop();
			System.out.println(str);

		}
		System.out.println("THIS IS LOOPING THROUGH THE STACK:");
		for (int i = 0; i < stack1.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

//		Demonstrate how to use Stack that includes push,peek,search,pop elements.
		Stack stack = new Stack<>();

// Push elements to the stack
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack);


// Peek at the top element of the stack
		System.out.println("Peek at the top element of the stack: ");
		System.out.println(stack.peek());

// Search for an element in the stack
		System.out.println(stack.search(3));


//# Pop an element from the stack
		System.out.println(stack.pop());


	}
}
