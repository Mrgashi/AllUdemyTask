package src.com.udemy.sortedcollections;

import java.util.Map;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        // write your code here
        StockItem temp = new StockItem("Bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("Car", 2.10, 2);
        stockList.addStock(temp);

        temp = new StockItem("Chair", 0.50, 10);
        stockList.addStock(temp);

        temp = new StockItem("Cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("Cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("Door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("Juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("Phone", 96.99, 80);
        stockList.addStock(temp);

        temp = new StockItem("Towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("Vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket mirdonsBasket = new Basket("Mirdons basket");
        sellItem(mirdonsBasket, "Car", 1);
        System.out.println(mirdonsBasket);

        sellItem(mirdonsBasket, "Car", 1);
        System.out.println(mirdonsBasket);

        sellItem(mirdonsBasket, "Car", 1);
        System.out.println(mirdonsBasket);

        if (sellItem(mirdonsBasket, "Car", 1) != 1) {
            System.out.println("There are no more cars in stock");
        }
        sellItem(mirdonsBasket, "spanner", 5);
        sellItem(mirdonsBasket, "Juice", 4);
        sellItem(mirdonsBasket, "Cup", 5);
        sellItem(mirdonsBasket, "Bread", 5);

        Basket basket = new Basket("Customer");
        sellItem(basket, "Cup", 100);
        sellItem(basket, "Juice", 5);
        removeItem(basket, "Cup", 1);
        System.out.println(basket);

        removeItem(mirdonsBasket, "Car", 1);
        removeItem(mirdonsBasket, "Cup", 9);
        removeItem(mirdonsBasket, "Car", 1);
        System.out.println("Cars removed " + removeItem(mirdonsBasket, "Car", 1)); // should not remove any car.

        System.out.println(mirdonsBasket);

        removeItem(mirdonsBasket, "Bread", 5);
        removeItem(mirdonsBasket,"Cup", 5);
        removeItem(mirdonsBasket, "Juice", 4);
        removeItem(mirdonsBasket, "Cup", 3);
        System.out.println(mirdonsBasket);

        System.out.println("\nDisplay StockList before and after checkout");
        System.out.println(basket);
        System.out.println(stockList);
        checkOut(basket);
        System.out.println(basket);
        System.out.println(stockList);

        checkOut(mirdonsBasket);
        System.out.println(mirdonsBasket);


    }

    public static int sellItem(Basket basket, String item, int quantity) {
        // retrieving the item from stock list.
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We dont sell " + item);
            return 0;
        }
        if (stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        // retrieving the item from stock list.
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We dont sell " + item);
            return 0;
        }
        if (basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unReserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}