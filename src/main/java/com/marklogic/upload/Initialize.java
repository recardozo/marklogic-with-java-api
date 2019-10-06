package com.marklogic.upload;

import com.marklogic.client.Transaction;
import com.marklogic.connection.ConnectionManager;
import com.marklogic.publications.Publication;

import java.io.File;
import java.util.List;

public class Initialize {
    
    private Publication publication;
    private List<File> publicationsFiles;
    private Upload uploader;
    
    public void initialize (String directory) {
        ConnectionManager connectionManager = ConnectionManager.getInstance ();
        Transaction transaction = connectionManager.getTransaction ();
        try {
            upload (directory);
            transaction.commit ();
        } catch (Exception e) {
            transaction.rollback ();
        }
    }
    
    private void upload (String directory) {
        publication = new Publication ();
        publicationsFiles = publication.getFilesToUpload (directory);
        uploader = new Upload ();
        uploader.upload (publicationsFiles);
    }
}
