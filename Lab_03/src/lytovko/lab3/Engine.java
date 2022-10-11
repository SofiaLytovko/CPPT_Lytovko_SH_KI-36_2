package lytovko.lab3;

import java.io.PrintWriter;
/**
 * Class Engine
 * @author Lytovko Sofia KI-36
 * @version 1.0
 */
public class Engine {

    private int fuel = 0;
    private final int FUEl_BANK_CAPACITY = 1000;
    private PrintWriter fout;
    /**
     * Constructor
     * @param fout
     */
    public Engine(PrintWriter fout)
    {
        this.fout = fout;
    }
    /**
     * Method starts the engine
     * @param sec
     * @throws Exception
     */
    public void run(int sec) throws Exception {
        for(int i = 0; i < sec; i++)
        {
            if(fuel < 1)
            {
                throw new Exception("No fuel!");
            }
            fuel -= 10;
            message("Remain fuel: " + fuel);
            Thread.sleep(1000);
        }
    }
    /**
     * Method refuels the engine
     */
    public void refuel()
    {
        fuel = FUEl_BANK_CAPACITY;
    }
    /**
     * Method closes the file
     */
    public void dispose()
    {
        fout.flush();
        fout.close();
    }
    /**
     * Method returns fuel level
     */
    public int getFuelLevel()
    {
        return fuel;
    }

    protected void message(String message)
    {
        System.out.println(message);
        fout.println(message);
    }

}