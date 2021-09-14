import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The enemy sub will kill the sub if the sub touches them.
 * @author: Kaan Black
 * @version: Date 8/31/2021
 */
public class EnemySub extends Actor
{
    //This method repeats the following actions 
    public void act()
    {
        move(3);
        turnAtEdge();
        
    }

    // Turns the Lobter at the edge
    private void turnAtEdge( )
    {
        if(Greenfoot.getRandomNumber(200) < 100)
        {
            if(isAtEdge())
            {
                turn(50);
            }
        }
        else if(Greenfoot.getRandomNumber(200) < 50)
        {
            if(isAtEdge())
            {
                turn(100);
            }
        }
        else if(Greenfoot.getRandomNumber(200) < 150)
        {
            if(isAtEdge())
            {
                turn(10);
            }
        }
    }
    
    
    
}
