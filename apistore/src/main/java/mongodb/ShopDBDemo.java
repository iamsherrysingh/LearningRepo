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
	static void connectToDB(String databaseName) {
	    try{
//	    	MongoClient mongoClient = MongoClients.create("mongodb://root:root@192.168.0.100:27017/?authSource=admin");
	    	MongoClient mongoClient = MongoClients.create("mongodb+srv://root:root@cluster0.7x5gx.mongodb.net/<dbname>?retryWrites=true&w=majority");
	    	database= mongoClient.getDatabase(databaseName);
	    	System.out.println("CONNECTED TO DATABASE: "+databaseName);
	    }catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		String databaseName= "shopdb";
		connectToDB(databaseName);
		
		MongoIterable<String> iterableCollections= database.listCollectionNames();
		
		//Collections in database
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
		
		//findIterable.forEach(printBlock);
	}
}
