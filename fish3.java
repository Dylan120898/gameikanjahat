import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fish3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fish3 extends Actor
{
    /**
     * Act - do whatever the fish3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         move (1) ;
        if (Greenfoot.getRandomNumber (20) < 10)
    {
        turn (Greenfoot.getRandomNumber (50) - 20) ;
    } 
   }    
}

