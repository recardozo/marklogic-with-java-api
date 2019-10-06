package com.marklogic.connection;

import com.marklogic.client.DatabaseClient;
import com.marklogic.client.DatabaseClientFactory;

public class Connection {
    
    public final String HOST = "192.168.15.18";
    public final String USERNAME = "admin";
    public final String PASSWORD = "admin";
    public final String DATABASE = "playground";
    public final int PORT = 8000;
    
    public DatabaseClient getClient () {
        DatabaseClientFactory.DigestAuthContext authContext = new DatabaseClientFactory.DigestAuthContext (USERNAME, PASSWORD);
        DatabaseClient client = DatabaseClientFactory.newClient (HOST, PORT, DATABASE, authContext);
        return client;
    }
    
}
