

public class SpaceShip
{
    private int numSmartBombs;
    private int Lives;
    private boolean hasHuman;


    public SpaceShip()
    {
        numSmartBombs = 3;
        hasHuman = false;
        Lives = 3;
    }

    public int getNumSmartBombs()
    {
        return numSmartBombs;
    }

    public boolean hasHuman()
    {
        return hasHuman;
    }

    public int getLives()
    {
        return Lives;
    }
}