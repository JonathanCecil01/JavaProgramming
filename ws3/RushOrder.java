public class RushOrder extends Order {
    protected int deliveryDay;
    
    RushOrder(int deliveryDay)
    {
        super();
        this.deliveryDay = deliveryDay;
    }
    
    @Override
    int getTotal()
    {
        int total = super.getTotal();
        if(total == 0)
        {
            return total;
        }
        else
        {
            switch(deliveryDay) {
                case 1:
                    total += 25;
                    break;
                
                case 2:
                    total += 15;
                    break;
                    
                case 3:
                    total += 10;
                    break;
                    
                default:
                    break;
            }
            
            return total;
        }
    }
}
