package com.pluralsight.organized;
import java.util.*;

public class ModelFactory {

    private static Map<Integer, String> map;
    static
    {
        map = new HashMap<>();
        map.put(1, "Ishtromech");
        map.put(2, "Seeker");
        map.put(3, "Battle");
    }

    private String modelType;

    // Driver code
    public static void main(String[] args)
    {
        System.out.println(map);

    }

    public void main (String modelType) {
        this.modelType = modelType;}

    public String getModelType() {
        return this.modelType;
    }
}
