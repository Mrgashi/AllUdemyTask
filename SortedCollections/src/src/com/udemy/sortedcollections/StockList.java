package src.com.udemy.sortedcollections;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock (StockItem item) {
        if (item != null) {
            // check if already have quantities for this item.
            StockItem inStock = list.getOrDefault(item.getName(), item);
            // if there already stocks of this item, adjust the quantity
            if(inStock != item) {
                item.adjustStock(inStock.availableQuantity());
            }
            list.put(item.getName(), item);
            return item.availableQuantity();
        }
        return 0;
    }

    public int sellStock(String item, int quantity) {
        StockItem inStock =  list.get(item);

        if ((inStock != null) && (quantity > 0)) {
            return inStock.finaliseStock(quantity);
        }
        return 0;
    //   StockItem inStock = list.getOrDefault(item, null);

    //   if ((inStock != null) && (inStock.availableQuantity() >= quantity) && (quantity > 0 )) {
    //       inStock.adjustStock(- quantity);
    //       return quantity;
    //   }
    //   return 0;
    }

    public int reserveStock(String item, int quantity) {
        StockItem inStock = list.get(item);

        if((inStock != null) && (quantity > 0)) {
            return inStock.reservStock(quantity);
        }
        return 0;
    }

    public int unReserveStock(String item, int quantity) {
        StockItem inStock = list.get(item);

        if ((inStock != null) && (quantity > 0)) {
            return inStock.unReserveStock(quantity);
        }
            return 0;
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    public Map<String, StockItem> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.availableQuantity();

            s = s + stockItem + ". There are " + stockItem.availableQuantity() + " in stock. Value of items: ";
            s = s + String.format("%.2f", itemValue) + "\n";
            totalCost += itemValue;
        }
        return s + "Total stock value " + String.format("%.2f",totalCost);
    }
}