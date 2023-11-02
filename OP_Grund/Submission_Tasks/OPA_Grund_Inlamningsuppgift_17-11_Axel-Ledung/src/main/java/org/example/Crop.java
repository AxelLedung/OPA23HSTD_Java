package org.example;

public class Crop extends Entity{
    private String cropType;
    public String getCropType() {
        return cropType;
    }
    public void setCropType(String cropType) {
        this.cropType = cropType;
    }
    private int quantity;
    @Override public String GetDescription() {
        return "";
    }
    public void AddCrop(int quantity) {

    }
    public boolean TakeCrop(int quantity) {
        return false;
    }
}
