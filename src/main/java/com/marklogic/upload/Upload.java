package com.marklogic.upload;

import com.marklogic.services.PublicationService;

import java.io.File;
import java.util.List;

public class Upload {
    
    private PublicationService service;
    
    public void upload (List<File> publicationsFiles) {
        service = new PublicationService ();
        publicationsFiles.forEach (file -> {
            service.savePdfFile (file);
        });
        
    }
}
