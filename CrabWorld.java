import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,137,276);
        Worm worm = new Worm();
        addObject(worm,332,110);
        Worm worm2 = new Worm();
        addObject(worm2,43,52);
        Worm worm3 = new Worm();
        addObject(worm3,147,486);
        Worm worm4 = new Worm();
        addObject(worm4,551,7);
        Worm worm5 = new Worm();
        addObject(worm5,362,432);
        Worm worm6 = new Worm();
        addObject(worm6,204,267);
        Worm worm7 = new Worm();
        addObject(worm7,80,394);
        Worm worm8 = new Worm();
        addObject(worm8,443,299);
        Lobster lobster = new Lobster();
        addObject(lobster,460,80);
    }
}