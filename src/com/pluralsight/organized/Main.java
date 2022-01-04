package com.pluralsight.organized;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Droid droid1 = new Droid("R2D2","Astromech", "Starship repair/support");
    Droid droid2 = new Droid("R4D2","tromech", "Starship repaired/contacted");
    droid2.speak();

    /*
    System.out.println(droid2.getSerialNumber());
    you will still have to use the get method to call each thing in the parameter
    System.out.println(droid1.getSerialNumber());
    System.out.println(droid1.getModelType());
    droid1.setPurpose("Starship repair/support");
    System.out.println(droid1.getPurpose());
    droid1.speak();
    */

    }
}
