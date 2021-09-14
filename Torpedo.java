import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Torpedo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Torpedo extends Actor
{
    /**
     * Act - do whatever the Torpedo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(4);
        onCollision();
        turnAtEdge();
    }
    
    private void onCollision()
    {
        if(isTouching(EnemySub.class))
        {
            removeTouching(EnemySub.class);
        }   
        if(isTouching(Mine.class))
        {
            removeTouching(Torpedo.class);
            removeTouching(Mine.class);
        }   
    }
    
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            remove
        }
    }
}
