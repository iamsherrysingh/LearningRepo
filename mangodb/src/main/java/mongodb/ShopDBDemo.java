package mongodb;

import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

public class ShopDBDemo {

	static MongoDatabase database;
	static void connectToDB() {
	    MongoClient mongoClient = MongoClients.create("mongodb://root:root@192.168.0.100:27017/?authSource=admin");
		database= mongoClient.getDatabase("shopdb");
	}
	
	public static void main(String[] args) {
		connectToDB();
		
		MongoIterable<String> iterableCollections= database.listCollectionNames();
		for(String collection: iterableCollections) {
			System.out.println(collection);
		}
		System.out.println("-------------------------");
		
		MongoCollection<Document> productsCollection= database.getCollection("product");
		FindIterable<Document> findIterable = productsCollection.find(new Document());
		Block<Document> printBlock = new Block<Document>() {
		    public void apply(final Document document) {
		        System.out.println(document.toJson());
		    }
		};
		
		findIterable.forEach(printBlock);
	}
}
