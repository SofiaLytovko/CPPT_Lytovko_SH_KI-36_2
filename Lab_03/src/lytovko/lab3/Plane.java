package lytovko.lab3;

import java.io.File;
import java.io.PrintWriter;
/**
 * Class Plane
 * @author Lytovko Sofia KI-36
 * @version 1.0
 */
public class Plane {

    protected PrintWriter fout;
    protected Chassis chassis = new Chassis();
    private boolean isInTheAir = false;
    private Engine engine;
    /**
     * Constructor
     * @throws Exception
     */
    public Plane() throws Exception
    {
        fout = new PrintWriter(new File("lab3.txt"));
        engine = new Engine(fout);
    }
    /**
     * Method starts the engine
     * @param sec
     * @throws Exception
     */
    public void startEngine(int sec) throws Exception
    {
        engine.run(sec);
    }
    /**
     * Method refuels the engine
     */
    public void refuel()
    {
        message("Engine refuel...");
        engine.refuel();
    }
    /**
     * Method returns isOpen value
     */
    public boolean isChassisOpen(){
        return chassis.isOpen();
    }
    /**
     * Method closes the chassis
     */
    public void closeChassis() {
        chassis.close();
        message("Chassis closed");
    }
    /**
     * Method opens the chassis
     */
    public void openChassis() {
        chassis.open();
        message("Chassis open");
    }
    /**
     * Method for landing
     */
    public void land() throws Exception
    {
        if(!chassis.isOpen())
        {
            throw new Exception("Chassis isn't open");
        }

        isInTheAir = false;

    }
    /**
     * Method starts to fly
     */
    public void startFly() {
        isInTheAir = true;
    }
    /**
     * Method returns fuel level
     */
    public int getFuelLevel()
    {
        return engine.getFuelLevel();
    }
    /**
     * Method closes the file
     */
    public void dispose()
    {
        fout.flush();
        fout.flush();
        engine.dispose();
    }

    protected void message(String message)
    {
        System.out.println(message);
        fout.println(message);
    }
}