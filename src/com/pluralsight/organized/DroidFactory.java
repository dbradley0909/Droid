package com.pluralsight.organized;


public class DroidFactory extends Droid {

    public DroidFactory(String serialNumber, String modelType, String purpose) {
        super(serialNumber, modelType, purpose);
    }

    public DroidFactory(String modelType, String purpose) {
        super(modelType, purpose);
    }

    public DroidFactory(String serialNumber) {
        super(serialNumber);
    }

}