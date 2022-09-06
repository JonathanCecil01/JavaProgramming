package MyAnimals;

public abstract class Animal {
    protected Animal(int legs) {
        this.legs = legs;
    }
    protected int legs;
    public abstract String eat();

    public String walk() {
        return "This Animal Walks with "+legs+" legs";
    }
}
