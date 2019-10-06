package com.marklogic.connection;

import com.marklogic.client.DatabaseClient;
import com.marklogic.client.Transaction;

public class ConnectionManager {
    
    private static ConnectionManager INSTANCE = null;
    private Connection connection;
    private DatabaseClient client;
    private Transaction transaction;
    
    private ConnectionManager () {
    }
    
    public static synchronized ConnectionManager getInstance () {
        if (INSTANCE == null) {
            INSTANCE = new ConnectionManager ();
            INSTANCE.getConnection ();
        }
        return INSTANCE;
    }
    
    private void getConnection () {
        setClient ();
        setTransaction ();
    }
    
    private void setClient () {
        connection = new Connection ();
        client = connection.getClient ();
    }
    
    private void setTransaction () {
        transaction = client.openTransaction ();
    }
    
    public DatabaseClient getClient () {
        return client;
    }
    
    public Transaction getTransaction () {
        return transaction;
    }
}
