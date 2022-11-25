package KI36.Lytovko.Lab7;

public abstract class Item {
    protected int weight;
    protected String name;
    /**
     * Constructor
     * @param weight Item weight
     * @param name Item name
     */
    public Item(int weight, String name)
    {
        this.name = name;
        this.weight = weight;
    }
    /**
     * Methods returns item weight
     */
    public int getWeight() {
        return weight;
    }
    /**
     * Methods returns item name
     */
    public String getName() { return name; }
    /**
     * Methods prints item data
     */
    public void printData()
    {
        System.out.println("Name:" + name);
        System.out.println("Weight:" + weight);
    }
}
