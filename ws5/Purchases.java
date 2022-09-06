class PurchaseItem{
    private String name;
    private double unitPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getPrice()
    {
        return unitPrice;
    }
    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    PurchaseItem()
    {
        this.name = "no item";
        this.unitPrice = 0;
    }
    PurchaseItem(String name, double unitPrice)
    {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public String toString()
    {
        return this.name+"@"+String.valueOf(this.unitPrice);
    }

}
class WeightedItem extends PurchaseItem
{
    private double weight;
    WeightedItem(double weight, String name, double unitPrice)
    {
        super(name, unitPrice);
        this.weight = weight;
    }
    WeightedItem()
    {
        super();
        this.weight = 0.0;
    }
    @Override
    public double getPrice()
    {
        return this.getUnitPrice()*weight;
    }
    @Override
    public String toString()
    {
        return super.toString() + String.valueOf(this.weight)+"Kg" + "\t"+String.valueOf(this.getPrice())+"SR";
    }
}

class CountedItem extends PurchaseItem
{
    private int quantity;
    CountedItem()
    {
        super();
        this.quantity = 0;
    }
    CountedItem(String name, double unitPrice, int quantity)
    {
        super(name, unitPrice);
        this.quantity = quantity;
    }
    @Override
    public double getPrice()
    {
        return this.getUnitPrice()*quantity;
    }
    @Override
    public String toString()
    {
        return super.toString() + String.valueOf(this.quantity)+"unit" + "\t"+String.valueOf(this.getPrice())+"SR";
    }
}



public class Purchases {
    public static void main(String[]args)
    {
        PurchaseItem bnna = new WeightedItem(1.37, "Banana", 3.00);
        System.out.println(bnna.toString());
    }


}
