package org.example;

public class Entity {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    protected String name;
    public String GetDescription() {
        return id + " & " + name;
    }
    public Entity (int id, String name) {
        this.id = id;
        this.name = name;
    }
}
