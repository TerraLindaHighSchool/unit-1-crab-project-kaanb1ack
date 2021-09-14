import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)
import java.lang.Math.*;
public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(700, 700, 1);
        prepare();
        checkKeyPress();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Sub sub = new Sub();
        addObject(sub,50,276);
        for(int i = 0; i < 10; i++)
        {
            Treasure treasure = new Treasure();
            addObject(treasure, (int) (Math.random() * 700), (int) (Math.random() * 700));
        }

        for(int i = 0; i < 8; i++)
        {
            EnemySub enemySub = new EnemySub();
            addObject(enemySub, (int) (Math.random() * 700), (int) (Math.random() * 700));
        }

        for(int i = 0; i < 23; i++)
        {
              Mine mine = new Mine();
            addObject(mine, (int) (Math.random() * 700), (int) (Math.random() * 700));
            
        }
        
    }
    
    private void checkKeyPress()
    {
    
    }
}