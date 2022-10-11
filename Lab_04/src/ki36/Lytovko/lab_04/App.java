package ki36.Lytovko.lab_04;
/**
 * Class App
 * @author Sofia
 * 
 */
public class App {
    /**
     * @param argc
     */
    public static void main(String[] argc)
    {
        try
        {
            Bomber bomber = new Bomber();
            bomber.closeChassis();
            bomber.refuel();
            bomber.startFly();
            bomber.startEngine(4);
            bomber.throwBomb();
            bomber.dispose();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}