/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class MongoDBManager {
    private String cluster;
    private MongoClientURI uri;
    private MongoClient mongoClient;
    private MongoDatabase database; 
    private MongoCollection collection;
    private MongoCollection userCollection;
    private DBCursor cursor = null;
    
  
    public void connect() {
        cluster = "mongodb+srv://NullPointers:admin123@finalproyect.6vyqq.mongodb.net/ApplianceStore?retryWrites=true&w=majority";
        uri = new MongoClientURI(cluster);
        mongoClient = new MongoClient(uri);
        database= mongoClient.getDatabase("ApplianceStore");
        collection = database.getCollection("Products");
        userCollection = database.getCollection("Users");
    }
      

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public MongoClientURI getUri() {
        return uri;
    }

    public void setUri(MongoClientURI uri) {
        this.uri = uri;
    }

    public MongoClient getMongoClient() {
        return mongoClient;
    }

    public void setMongoClient(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    public MongoDatabase getDatabase() {
        return database;
    }

    public void setDatabase(MongoDatabase database) {
        this.database = database;
    }

    public MongoCollection getCollection() {
        return collection;
    }

    public void setCollection(MongoCollection collection) {
        this.collection = collection;
    }

    public MongoCollection getUserCollection() {
        return userCollection;
    }

    public void setUserCollection(MongoCollection userCollection) {
        this.userCollection = userCollection;
    }

    public DBCursor getCursor() {
        return cursor;
    }

    public void setCursor(DBCursor cursor) {
        this.cursor = cursor;
    }

   
    
}
