package mongodb;

import java.util.Arrays;

import org.bson.Document;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

import model.shoppingdb.collections.Customer;

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
		
		MongoCollection<Document> customerCollection= database.getCollection("Customer");
		Document document = new Document("name", "Café Con Leche")
	               .append("contact", new Document("phone", "228-555-0149")
	                                       .append("email", "cafeconleche@example.com")
	                                       .append("location",Arrays.asList(-73.92502, 40.8279556)))
	               .append("stars", 3)
	               .append("categories", Arrays.asList("Bakery", "Coffee", "Pastries"));
		customerCollection.insertOne(document);
		
	}

}
