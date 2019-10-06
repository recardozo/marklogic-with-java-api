package com.marklogic.metadata;

import com.marklogic.client.io.DocumentMetadataHandle;
import com.marklogic.utils.PublicationUtils;

import java.io.File;
import java.util.Date;

public class WriteMetadata {
    
    PublicationUtils utils;
    
    public DocumentMetadataHandle write (File file) {
        utils = new PublicationUtils ();
        String currentDate = utils.formatedDate (new Date ());
        return new DocumentMetadataHandle ()
                .withMetadataValue ("publication-date", currentDate);
    }
}
