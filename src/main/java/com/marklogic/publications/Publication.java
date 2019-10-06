package com.marklogic.publications;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Publication {
    
    private List<File> filesToUpload;
    
    public List<File> getFilesToUpload (String directory) {
        filesToUpload = new ArrayList<> ();
        File rootFile = new File (directory);
        File[] files = rootFile.listFiles ();
        
        checkFiles (files);
        addFiles (files);
        return filesToUpload;
    }
    
    private void checkFiles (File[] files) {
        if (files == null) {
            throw new RuntimeException ("Files can't be null!");
        }
    }
    
    private void addFiles (File[] files) {
        for (File file : files) {
            checkFile (file);
            filesToUpload.add (file);
        }
    }
    
    private void checkFile (File file) {
        if (file.isDirectory ()) {
            getFilesToUpload (file.getAbsolutePath ());
        }
    }
}
