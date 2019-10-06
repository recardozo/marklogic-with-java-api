package com.marklogic.services;

import com.marklogic.client.io.DocumentMetadataHandle;
import com.marklogic.metadata.WriteMetadata;
import com.marklogic.repositories.PublicationRepository;

import java.io.File;

public class PublicationService {
    
    private WriteMetadata writer;
    private UriService uriService;
    private PublicationRepository repository;
    private DocumentMetadataHandle metadataHandle;
    
    public PublicationService () {
        this.uriService = new UriService ();
        this.writer = new WriteMetadata ();
        this.repository = new PublicationRepository ();
    }
    
    public void savePdfFile (File file) {
        String uri = uriService.setPdfUri (file.getName ());
        metadataHandle = writer.write ();
        repository.save (uri, metadataHandle, file);
    }
}
