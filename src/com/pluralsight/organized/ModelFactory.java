package com.pluralsight.organized;
import java.util.*;

public class ModelFactory {

    private static Map<String, String> map;
    static
    {
        map = new HashMap<>();
        map.put("one", "Ishtromech");
        map.put("two", "Seeker");
        map.put("three", "Battle");
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
