package lytovko.lab3;
/**
 * Class Chassis
 * @author Lytovko Sofia KI-36
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