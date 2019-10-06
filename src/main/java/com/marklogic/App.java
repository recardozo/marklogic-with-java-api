package com.marklogic;

import com.marklogic.connection.ConnectionManager;

public class App {
    public static void main (String[] args) {
        String directory=args[0];
        ConnectionManager connectionManager = ConnectionManager.getInstance ();
    }
}
