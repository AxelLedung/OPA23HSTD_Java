package org.example;

import java.util.ArrayList;

public class Animal extends Entity{
    private String species;
    private ArrayList<Crop> acceptableCropTypes = new ArrayList<Crop>();
    private static int nextAnimalId = 1;
    public Animal(String name, String species) {
        super(nextAnimalId, name);
        nextAnimalId++;
        this.species = species;
        this.name = name;
    }
    @Override public String GetDescription() {
        return "ID: " + getId() + " Name: " + name + " Species: " + species;
    }
    @Override public String GetCSV() {
        return getId() + "," + name + "," + species;
    }
    public void Feed(Crop crop) {

    }
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
