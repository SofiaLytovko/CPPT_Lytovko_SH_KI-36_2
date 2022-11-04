package ki36.Lytovko.lab_04;
/**
 * Class Bomber
 * @author Sofia
 * 
 */
public class Bomber extends Plane implements IBomber{
    
	private int bombs = 50;
    /**
     * Constructor
     * @throws Exception
     */
    public Bomber() throws Exception {}
    /**
     * Method throws a bomb
     * @throws Exception
     */
    public void throwBomb() throws Exception {
        if(bombs == 0)
        {
            throw new Exception("No bombs");
        }
        bombs -= 1;
        super.message("Remain bombs: " + bombs);
    }

}