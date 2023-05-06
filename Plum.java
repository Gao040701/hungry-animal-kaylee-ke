import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plum extends Actor
{
    /**
     * Act - do whatever the Plum wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY()+3);
        
        //remove plum and decrease score when it gets to bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.removeObject(this);
            world.decreaseScore();
            world.createPlum();
        }
    }
}
