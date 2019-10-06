package com.marklogic.services;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UriServiceTest {
    
    UriService uriService;
    
    @Before
    public void setUp () {
        uriService = new UriService ();
    }
    
    @Test
    public void setPdfUriTest () {
        String filename = "teste.pdf";
        String result = uriService.setPdfUri (filename);
        String expectedResult = "publication/pdf/teste.pdf";
        assertEquals (expectedResult, result);
    }
    
    @Test
    public void setXmlUriTest () {
        String filename = "teste.xml";
        String result = uriService.setXmlUri (filename);
        String expectedResult = "publication/xml/teste.xml";
        assertEquals (expectedResult, result);
    }
}