package MyAnimals;

public class Spider extends Animal{
    Spider()
    {
        super(8);
    }
    @Override
    public String eat() {
        return "Spider eats smaller insects";
    }
}
