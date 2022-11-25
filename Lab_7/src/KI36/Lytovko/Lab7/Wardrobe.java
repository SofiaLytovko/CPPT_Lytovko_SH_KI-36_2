package KI36.Lytovko.Lab7;

import java.util.ArrayList;
/**
 * Class Wardrobe
 * @version 1.0
 */
public class Wardrobe<T extends Item> {
    private ArrayList<T> storage = new ArrayList();
    /**
     * Method returns an item by the index
     * @param index Element index
     * @throws Exception
     */
    public T get(int index)
    {
        try{
            return storage.get(index);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    /**
     * Method adds an item
     * @param item Item to be added
     */
    public void add(T item)
    {
        try {
            storage.add(item);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    /**
     * Method shows storage content
     */
    public void showAll()
    {
        for(int i = 0; i < storage.size(); i++)
        {
            try{
                storage.get(i).printData();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
    /**
     * Method returns total weight
     */
    public int getTotalWeight()
    {
        int result = 0;
        for(int i = 0; i < storage.size(); i++)
        {
            result += storage.get(i).getWeight();
        }
        return result;
    }
    /**
     * Method returns an item with maximal weight
     */
    public T getItemWithMinWeight()
    {
        int minIdx = 0;

        for(int i = 0; i < storage.size(); i++)
        {
            if(i == 0)
            {
                continue;
            }
            if(storage.get(i).getWeight() > storage.get(minIdx).getWeight())
            {
                minIdx = i;
            }
        }
        return storage.get(minIdx);
    }
}
