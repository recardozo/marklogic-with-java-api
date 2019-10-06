package com.marklogic.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PublicationUtils {
    
    public String formatedDate (Date date) {
        return new SimpleDateFormat ("ddMMyyyy")
                .format (date);
    }
}
