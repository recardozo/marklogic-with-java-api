package com.marklogic.upload;

import com.marklogic.publications.Publication;

import java.io.File;
import java.util.List;

public class Initialize {
    
    
    public void startInitialize (String directory) {
        Publication publication = new Publication ();
        List<File> publicationsFiles = publication.getFilesToUpload (directory);
        Upload uploader = new Upload ();
        uploader.upload (publicationsFiles);
    }
}
