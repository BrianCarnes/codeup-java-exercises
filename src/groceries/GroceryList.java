//This code is a little stinky//
package groceries;

import util.Input;

import java.util.ArrayList;
import java.util.Collections;

public class GroceryList {
    //Variable Declarations and Object Creation//
    Grocery dairy = new Grocery("Dairy");
    Grocery grains = new Grocery("Grains");
    Grocery meats = new Grocery("Meats");
    Grocery produce = new Grocery("Produce");
    Grocery other = new Grocery("Other");
    Input input = new Input();
    private final ArrayList<Grocery> groceryList = new ArrayList<>();
    //all SETTERS with built-in Inputs//
    public void setDairy() {
        String item = input.getString("Which dairy item would you like to add?");
        int amount = input.getInt("How many units of " + item + " would you like?");
        dairy.setItemAmount(item, amount);
    }
    public void setGrains() {
        String item = input.getString("Which grain item would you like to add?");
        int amount = input.getInt("How many units of " + item + " would you like?");
        grains.setItemAmount(item, amount);
    }
    public void setMeats() {
        String item = input.getString("Which meat item would you like to add?");
        int amount = input.getInt("How many units of " + item + " would you like?");
        meats.setItemAmount(item, amount);
    }
    public void setProduce() {
        String item = input.getString("Which produce item would you like to add?");
        int amount = input.getInt("How many units of " + item + " would you like?");
        produce.setItemAmount(item, amount);
    }
    public void setOther() {
        String item = input.getString("Which miscellaneous item would you like to add?");
        int amount = input.getInt("How many units of " + item + " would you like?");
        other.setItemAmount(item, amount);
    }
    //ArrayList constructor//
    public void getGroceryList() {
        groceryList.add(dairy);
        groceryList.add(grains);
        groceryList.add(meats);
        groceryList.add(produce);
        groceryList.add(other);
    }
    //Program Starter//
    public boolean startGroceryList() {
        return input.yesNo("Would you like to start a grocery list?");
    }
    //Displays and stores selected Category//
    public String displayCategories () {
        System.out.println("Which category of grocery would you like to add?\n");
        for (Grocery cat : groceryList) {
            System.out.print("|" + cat.getCategory() + "| ");
        }
        System.out.println();
        return input.getString();
    }
    //Selection grabs user inputs to add into the categorized grocery list//
    public boolean selection () {
        boolean response = false;
            switch (displayCategories().toLowerCase()) {
                case "dairy" -> setDairy();
                case "grains" -> setGrains();
                case "meats" -> setMeats();
                case "produce" -> setProduce();
                case "other" -> setOther();
            }
            response = input.yesNo("Would you like to add another?");
            return response;
    }
    //Final Grocery List Print//
    public void finalDisplay () {
        for (Grocery cat : groceryList) {
            System.out.println("#####" + cat.getCategory().toUpperCase() + "#####");
            System.out.println(cat.getItemAmount().toString());
        }
    }
}
