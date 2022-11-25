package KI36.Lytovko.Lab7;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Wardrobe wardrobe = new Wardrobe();

        wardrobe.add(new Tshirt(200,"Tshirt1"));
        wardrobe.add(new Cap(100,"Cap1"));
        wardrobe.add(new Tshirt(100,"Tshirt2"));
        wardrobe.add(new Cap(250,"Cap2"));
        wardrobe.add(new Tshirt(200,"Tshirt3"));
        wardrobe.add(new Cap(390,"Cap3"));

        System.out.println(wardrobe.get(0).getName());
        System.out.println(wardrobe.get(1).getName());
        System.out.println(wardrobe.get(2).getName());
        System.out.println(wardrobe.get(3).getName());

        System.out.println(wardrobe.getItemWithMinWeight().getName());
        System.out.println(wardrobe.getTotalWeight());

    }
}
