import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Mine will explode the Sub if the Sub touches it.
 * @author: Kaan Black
 * @version: Date 8/31/2021
 */
public class Mine extends Actor
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
        if(isAtEdge())
        {
            turn(50);
        }
        
    }
}
