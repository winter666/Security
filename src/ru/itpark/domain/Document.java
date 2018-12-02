package ru.itpark.domain;

public class Document {
    private int id;
    private String name;
    private String minPermission;

    public Document(int id, String name, String minPermission) {
        this.id = id;
        this.name = name;
        this.minPermission = minPermission;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMinPermission() {
        return minPermission;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMinPermission(String minPermission) {
        this.minPermission = minPermission;
    }
}
