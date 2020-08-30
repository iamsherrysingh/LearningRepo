package mongodb;

import java.util.Arrays;

import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.ConnectionString;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.internal.MongoClientImpl;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

public class DBdemo2 {

	static MongoDatabase database;
	static void connectToDB() {
	    MongoClient mongoClient = MongoClients.create("mongodb://root:root@192.168.0.100:27017/?authSource=admin");
		database= mongoClient.getDatabase("shop");
	}
	
	public static void main(String[] args) {
		connectToDB();
		MongoCollection<Document> products= database.getCollection("products");
		FindIterable<Document> findIterable = products.find(new Document());
		Block<Document> printBlock = new Block<Document>() {
		    public void apply(final Document document) {
		        System.out.println(document.toJson());
		    }
		};
		
		findIterable.forEach(printBlock);
	}
}
