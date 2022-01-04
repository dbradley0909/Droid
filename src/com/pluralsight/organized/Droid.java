package com.pluralsight.organized;

// this is a class
public class Droid {

    protected String serialNumber;
    protected String modelType;
    protected String purpose;


    // this is an example of a constructor
    public Droid(String serialNumber, String modelType, String purpose) {
        this.serialNumber = serialNumber;
        this.modelType = modelType;
        this.purpose = purpose;
        //this.speak();

    }
    public Droid(String serialNumber){}

    public Droid(String modelType, String purpose) {
    }

    public void setPurpose(String purpose) {
        if (purpose.equals("Starship repair/support") || purpose.equals("Starship repaired/contacted")) {
            this.purpose = purpose;
        } else {
            this.purpose = "Never contacted support!";
        }
    }

    public String getPurpose() {
        return purpose;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getModelType() {
        return this.modelType;
    }

    public void speak() {
        System.out.println("Hello this is" + this.modelType + " with the serial number: " + this.serialNumber + ". Can I come to the repair shop?");
    }


//    public String toString() {//overriding the toString() method
//        return modelType + " " + serialNumber + " " + purpose;
//    }


}