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
        if(getRotation() > 180)
        {
            setImage("BackwardsEnemySub.png");
        }
        if(getRotation() <= 180)
        {
            setImage("enemySub.png");
        }
    }

    // Turns the Lobter at the edge
    private void turnAtEdge( )
    {
        if(isAtEdge())
        {
            turn(Greenfoot.getRandomNumber(180)); 
        }
    }
    
    
    
}
