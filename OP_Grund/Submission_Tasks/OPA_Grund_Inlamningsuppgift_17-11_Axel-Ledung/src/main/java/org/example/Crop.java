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
    private static int nextCropId = 1;
    public Crop(String name, String cropType, int quantity) {
        super(nextCropId, name);
        nextCropId++;
        this.cropType = cropType;
        this.name = name;
        this.quantity = quantity;
    }
    @Override public String GetDescription() {
        return "ID: " + getId() + " Name: " + name + " Crop type: " + cropType + " Qty: " + quantity;
    }
    public void AddCrop(int quantity) {
        this.quantity += quantity;
    }
    public boolean TakeCrop(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
            return true;
        }
        else {
            System.out.println("Your resquest was not possible due to low quantity");
            return false;
        }
    }
}
