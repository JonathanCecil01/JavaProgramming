public class OrderItem {
    private String upc;
    private int quantity;
    private int price;
    
    OrderItem()
    {
        upc = "None";
        quantity = 0;
        price = 0;
    }
    OrderItem(String upc, int quantity, int price)
    {
        this.upc = upc;
        this.quantity = quantity;
        this.price = price;
    }
    
    int getCost()
    {
        return quantity * price;
    }
    
    @Override
    public String toString()
    {
        return upc + " - " + quantity + " - " + price;
    }
}
