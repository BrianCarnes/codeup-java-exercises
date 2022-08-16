package groceries;

import util.Input;

public class GroceryApp {
    public static void main(String[] args) {
        GroceryList groceries = new GroceryList();
        if (!groceries.startGroceryList()) {
            System.exit(0);
        }
        groceries.getGroceryList();
        while (groceries.selection());
        groceries.finalDisplay();
    }
}
