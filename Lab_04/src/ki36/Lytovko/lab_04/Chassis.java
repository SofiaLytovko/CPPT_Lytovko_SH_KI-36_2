package ki36.Lytovko.lab_04;
/**
 * Class Chassis
 * @author Sofia
 * @version 1.0
 */
public class Chassis {
    private boolean isClosed = false;
    /**
     * Method returns isOpen value
     */
    public boolean isOpen() {
        return !isClosed;
    }
    /**
     * Method opens the chassis
     */
    public void open()
    {
        isClosed = false;
    }
    /**
     * Method closes the chassis
     */
    public void close()
    {
        isClosed = true;
    }
}