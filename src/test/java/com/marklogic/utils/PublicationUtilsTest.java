package com.marklogic.utils;

import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

public class PublicationUtilsTest {
    
    @InjectMocks
    PublicationUtils publicationUtils;
    
    @Test
    public void formatedDateTest () {
        publicationUtils= new PublicationUtils ();
        Date date = new Date ();
        String result = publicationUtils.formatedDate (date);
        assertNotNull (result);
    }
}
