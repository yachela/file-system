package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Folder implements SystemElement {

    private String name;
    private List<SystemElement> systemElements;

        public Folder(String name, List<SystemElement> systemElements) {
        this.name = name;
        this.systemElements = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void saveFile(File aFile) {
        this.systemElements.add(aFile);
    }


    @Override
    public int getSize() {
        return this.systemElements.stream().mapToInt(SystemElement::getSize).sum();
    }

    @Override
    public String getPath() {
        this.systemElements.stream()
                .map(SystemElement::getPath);
                return "/" + this.name;
    }
}
