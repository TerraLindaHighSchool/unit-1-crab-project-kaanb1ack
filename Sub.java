import greenfoot.*;

/**
 * This class defines a Sub. The Sub swims through the ocean
 * @author: Kaan Black
 * @version: Date
 */
public class Sub extends Actor
{
    //This method repeats the following actions 
    public void act()
    {
        checkKeyPress();
        onCollision();
    }

    // Turns the Crab at the edge

    // Checks for user key presses so user can turn the Crab
    private void checkKeyPress( )
    {
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 3, getY());
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 3, getY());
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 3);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 3);
        }
        
        if(Greenfoot.isKeyDown("space"))
        {
            fire();
        }
    }
    private void fire()
    {
        Torpedo torpedo = new Torpedo();
        getWorld().addObject(torpedo, getX(), getY());
    }

    // Checks for collisions with other objects
    private void onCollision( )
    {
        if(isTouching(Treasure.class))
        {
            removeTouching(Treasure.class);
            Greenfoot.playSound("slurp.wav");
            
            // Winning the game 
            if(getWorld().getObjects(Treasure.class).size() == 0)
            {
                Greenfoot.setWorld(new WinSplash());
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
        }
        
        if(isTouching(EnemySub.class))
        {
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
        
        if(isTouching(Mine.class))
        {
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }
}


