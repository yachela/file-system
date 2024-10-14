package org.example;

public class File implements SystemElement {
    private String name;
    private String type;
    private int fileSize;

    public File(String name, String type, int fileSize) {
        this.name = name;
        this.fileSize= fileSize;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public int getSize() {
        return this.fileSize;
    }
    @Override
    public String getPath() {
        return "/" + this.name + "." + this.type;
        //
    }
}
