package com.marklogic.connection;

import com.marklogic.client.DatabaseClient;
import com.marklogic.client.DatabaseClientFactory;

public class Connection {
    
    private final int PORT = 8000;
    private final String HOST = "192.168.15.12";
    private final String USERNAME = "admin";
    private final String PASSWORD = "admin";
    private final String DATABASE = "playground";
    
    public DatabaseClient getClient () {
        DatabaseClientFactory.DigestAuthContext authContext = new DatabaseClientFactory.DigestAuthContext (USERNAME, PASSWORD);
        DatabaseClient client = DatabaseClientFactory.newClient (HOST, PORT, DATABASE, authContext);
        return client;
    }
    
}
