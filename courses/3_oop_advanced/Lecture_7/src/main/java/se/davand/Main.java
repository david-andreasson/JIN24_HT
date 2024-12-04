package se.davand;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class Main {
    public static void main(String[] args) {
        // Etablera anslutning till MongoDB
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
// Välj databas
        MongoDatabase database = mongoClient.getDatabase("mydatabase");
// Välj collection
        MongoCollection<Document> collection = database.getCollection("users");
    }

}