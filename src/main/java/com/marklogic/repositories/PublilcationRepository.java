package com.marklogic.repositories;

import com.marklogic.client.DatabaseClient;
import com.marklogic.client.Transaction;
import com.marklogic.client.document.DocumentWriteSet;
import com.marklogic.client.document.GenericDocumentManager;
import com.marklogic.client.io.DocumentMetadataHandle;
import com.marklogic.connection.ConnectionManager;

import javax.swing.text.Document;
import java.io.File;

public class PublilcationRepository {
    
    private DatabaseClient client;
    private Transaction transaction;
    private DocumentWriteSet batch;
    private GenericDocumentManager documentManager;
    
    public PublilcationRepository () {
        setUpVariables ();
    }
    
    private void setUpVariables () {
        ConnectionManager connectionManager = ConnectionManager.getInstance ();
        client = connectionManager.getClient ();
        transaction = connectionManager.getTransaction ();
        documentManager = client.newDocumentManager ();
        batch = documentManager.newWriteSet ();
    }
    
    public void save (String uri, DocumentMetadataHandle metadataHandle, File file) {
        batch.addAs (uri, metadataHandle, file);
        documentManager.write (batch, transaction);
    }
}
