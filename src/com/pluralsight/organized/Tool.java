package com.pluralsight.organized;

public class Tool {

    private final String toolType;
    private int durability;
// dont put void in the constructor it will not allow you to use final in the above statement
    public Tool(String toolType, int durability ) {
        this.toolType = toolType;
        this.durability = 3;
    }

    public String getToolType() {
        return toolType;
    }
// had to get rid of both of the  in order for the final attribute  to work
   // public void setToolType(String toolType) {
    //   this.toolType = toolType;
    //}

    public int getDurability() {
        return durability;
    }

    //public void setDurability(int durability) {
    //  this.durability = durability;
    //}

//    @Override
//    public String toString() {
//        return   toolType +" " + durability;
//    }
//  enum must go towards  the bottom of any the classes or objects because it will not work it will keep giving errors
    public enum ToolType {
        STARSHIP_REPAIR;
    }
}
