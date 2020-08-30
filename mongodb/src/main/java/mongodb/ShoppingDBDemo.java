package mongodb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

public class ShoppingDBDemo {

	static MongoDatabase database;
	static void connectToDB(String databaseName) {
	    try{
	    	MongoClient mongoClient = MongoClients.create("mongodb://root:root@192.168.0.100:27017/?authSource=admin");
	    	database= mongoClient.getDatabase(databaseName);
	    	System.out.println("CONNECTED TO DATABASE: "+databaseName);
	    }catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		connectToDB("shoppingdb");
		
		create();
		read();
		update();
		delete();		
	}
	
	static void create() {
		MongoCollection<Document> customerCollection= database.getCollection("customer");
		Document document = new Document("name", "Café Con Leche")
	               .append("contact", new Document("phone", "228-555-0149")
	                                       .append("email", "cafeconleche@example.com")
	                                       .append("location",Arrays.asList(-73.92502, 40.8279556)))
	               .append("stars", 3)
	               .append("categories", Arrays.asList("Bakery", "Coffee", "Pastries"));
		customerCollection.insertOne(document);
		
		
		
		Document doc1 = new Document("name", "Amarcord Pizzeria")
	               .append("contact", new Document("phone", "264-555-0193")
	                                       .append("email", "amarcord.pizzeria@example.net")
	                                       .append("location",Arrays.asList(-73.88502, 40.749556)))
	               .append("stars", 2)
	               .append("categories", Arrays.asList("Pizzeria", "Italian", "Pasta"));


		Document doc2 = new Document("name", "Blue Coffee Bar")
		               .append("contact", new Document("phone", "604-555-0102")
		                                       .append("email", "bluecoffeebar@example.com")
		                                       .append("location",Arrays.asList(-73.97902, 40.8479556)))
		               .append("stars", 5)
		               .append("categories", Arrays.asList("Coffee", "Pastries"));
	
		List<Document> documents = new ArrayList<Document>();
		documents.add(doc1);
		documents.add(doc2);
	
		customerCollection.insertMany(documents);
	}
	
	static void read() {
		MongoCollection<Document> customerCollection = database.getCollection("customer");

		
		FindIterable<Document> customers= customerCollection.find();
		for (Document document : customers) {
			System.out.println(document.toJson());
		}
		
	}

	static void update() {
		
	}
	
	static void delete() {
		
	}
}
