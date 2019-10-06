package com.marklogic.services;

public class UriService {
    
    private final String PDF = "pdf/";
    private final String XML = "xml/";
    private final String PUBLICATION = "publication/";
    private StringBuilder stringBuilder;
    
    public String setPdfUri (String filename) {
        stringBuilder = new StringBuilder ()
                .append (PUBLICATION)
                .append (PDF)
                .append (filename);
        return stringBuilder.toString ();
    }
    
    public String setXmlUri (String filename) {
        stringBuilder = new StringBuilder ()
                .append (PUBLICATION)
                .append (XML)
                .append (filename);
        return stringBuilder.toString ();
    }
    
    
}
