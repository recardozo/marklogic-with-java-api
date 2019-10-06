package com.marklogic;

import com.marklogic.client.Transaction;
import com.marklogic.connection.ConnectionManager;
import com.marklogic.upload.Initialize;

public class App {
    public static void main (String[] args) {
        String directory = args[0];
        ConnectionManager connectionManager = ConnectionManager.getInstance ();
        Transaction transaction = connectionManager.getTransaction ();
        upload (directory);
        transaction.commit ();
    }
    
    private static void upload (String directory) {
        
        Initialize initialize = new Initialize ();
        initialize.startInitialize (directory);
    }
}
