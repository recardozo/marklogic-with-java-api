package com.marklogic;

import com.marklogic.upload.Initialize;

public class App {
    
    public static void main (String[] args) {
        String directory = args[0];
        upload (directory);
    }
    
    private static void upload (String directory) {
        Initialize initializer = new Initialize ();
        initializer.initialize (directory);
    }
}
