package mongodb;

import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

import model.Products;

import com.mongodb.MongoClientSettings;

public class DBdemo {

	static MongoDatabase database;
	static void connectToDB() {
		ConnectionString connString = new ConnectionString(
			    "mongodb://root:root@localhost:27017/shop?w=majority"
			);
			MongoClientSettings settings = MongoClientSettings.builder()
			    .applyConnectionString(connString)
			    .retryWrites(true)
			    .build();
			MongoClient mongoClient = MongoClients.create(settings);
			database = mongoClient.getDatabase("shop");
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
		System.out.println(products);
	}

}
