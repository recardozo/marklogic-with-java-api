package com.marklogic.services;

import com.marklogic.client.io.DocumentMetadataHandle;
import com.marklogic.metadata.WriteMetadata;
import com.marklogic.repositories.PublilcationRepository;

import java.io.File;

public class PublicationService {
    
    private UriService uriService;
    private WriteMetadata writer;
    private DocumentMetadataHandle metadataHandle;
    
    private PublilcationRepository repository;
    
    
    public PublicationService () {
        this.uriService = new UriService ();
        this.writer = new WriteMetadata ();
        this.repository = new PublilcationRepository ();
    }
    
    public void savePdfFile (File file) {
        String uri = uriService.setPdfUri (file.getName ());
        metadataHandle = writer.write (file);
        repository.save(uri,metadataHandle,file);
    }
}
