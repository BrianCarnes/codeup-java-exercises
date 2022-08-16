package groceries;

import java.util.HashMap;
//POJO GROCERY//
public class Grocery {
    private final String category;
    private final HashMap<String, Integer> itemAmount = new HashMap<>();

    public Grocery(String category) {
        this.category = category;
    }

    public String getCategory () {
        return category;
    }

    public void setItemAmount (String item, int amount) {
        itemAmount.put(item, amount);
    }
    public HashMap<String, Integer> getItemAmount () {
        return itemAmount;
    }

}
