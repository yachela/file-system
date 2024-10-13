package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        File file1 = new File("Document", "txt", 100);
        File file2 = new File("profile", "jpg",  200);

        List<SystemElement> subFolderElements = new ArrayList<>();
        subFolderElements.add(new File("SubFile1", "doc", 150));
        Folder subFolder = new Folder("SubFolder", subFolderElements);

        List<SystemElement> systemElements = new ArrayList<>();
        systemElements.add(file1);
        systemElements.add(file2);
        systemElements.add(subFolder);
        Folder DocumentsFolder = new Folder("Documents", systemElements);
        Folder Imagesfolder = new Folder("Images", systemElements);

    }
}