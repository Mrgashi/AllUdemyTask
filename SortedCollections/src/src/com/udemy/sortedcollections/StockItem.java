package src.com.udemy.sortedcollections;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityInStock; // can be initialized here.
    private int reserved = 0;

    public StockItem(String name, double price) { // since the quantityStock is not in the constructor we can initiate it
        this.quantityInStock = 0; // or here but not both
        this.name = name;
        this.price = price;
    }

    // adding this overloadedd constructor to be able to add quantity when making a stock item.
    public StockItem(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public int availableQuantity() {
        return quantityInStock - reserved;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public void adjustStock(int quantity) {
        int newQuantity = this.quantityInStock + quantity;
        if (newQuantity >= 0) {
            this.quantityInStock = newQuantity;
        }
    }

    public int reservStock(int quantity) {
        if (quantity <= availableQuantity()){
            reserved += quantity;
            return quantity;
        }
        return 0;
    }

    public int unReserveStock(int quantity) {
        if (quantity < reserved) {
            reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    public int finaliseStock(int quantity) {
        if (quantity <= reserved) {
            quantityInStock -= quantity;
            reserved -= quantity;
            return quantity;
        }
        return 0;
    }


    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering stock item.equals");
        if (obj == this) {
            return true;
        }
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        String objName = (((StockItem) obj).getName());
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem o) {
//        System.out.println("Entering StockItem.compareTo");
        if (this == o) {
            return 0;
        }
        if (o != null) {
            return this.name.compareTo(o.getName());
        }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + ": price " + this.price + " reserved: " + this.reserved;
    }
}
