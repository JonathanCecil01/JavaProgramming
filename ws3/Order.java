import java.util.ArrayList;


public class Order {
    ArrayList<OrderItem> items;
    
    Order()
    {
        items = new ArrayList<OrderItem>();
    }
    
    void addOrderItem(OrderItem item)
    {
        items.add(item);
    }
    
    int getTotal()
    {
        int total = 0;
        for(int i = 0; i < items.size(); i++)
        {
            total += items.get(i).getCost();
        }
        
        return total;
    }
    
    void printOrderItems()
    {
        System.out.println("ORDER DETAILS:");
        for(int i = 0; i < items.size(); i++)
        {
            System.out.println(items.get(i).toString());
        }
    }
}
