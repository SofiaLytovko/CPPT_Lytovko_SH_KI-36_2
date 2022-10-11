package lytovko.lab3;
/**
 * Class App
 * @author Lytovko Sofia KI-36
 * @version 1.0
 */
public class App {
    /**
     * @param argc
     */
    public static void main(String[] argc)
    {
        try
        {
            Plane plane = new Plane();
            plane.closeChassis();
            plane.refuel();
            plane.startFly();
            plane.startEngine(4);
            plane.dispose();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}