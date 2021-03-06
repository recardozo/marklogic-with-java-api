package com.marklogic.metadata;

import com.marklogic.client.io.DocumentMetadataHandle;
import com.marklogic.utils.PublicationUtils;

import java.util.Date;

public class WriteMetadata {
    
    private PublicationUtils utils;
    
    public DocumentMetadataHandle write () {
        utils = new PublicationUtils ();
        String currentDate = utils.formatedDate (new Date ());
        return new DocumentMetadataHandle ()
                .withMetadataValue ("publication-date", currentDate);
    }
}
