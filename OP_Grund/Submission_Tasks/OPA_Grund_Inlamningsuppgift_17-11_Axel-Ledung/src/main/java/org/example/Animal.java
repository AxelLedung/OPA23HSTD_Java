package org.example;

import java.util.ArrayList;

public class Animal extends Entity{
    private String species;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    private ArrayList<Crop> acceptableCropTypes = new ArrayList<Crop>();

    @Override public String GetDescription() {
        return species;
    }
    public void Feed(Crop crop) {

    }
}
