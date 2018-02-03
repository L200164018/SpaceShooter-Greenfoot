import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameOver extends World
{

    /**
     * Constructor for objects of class gameOver.
     * 
     */
    public gameOver()
    {    
        super(1080, 600, 1);
        Variables.stopTimer();
        display d = new display();
        d.updateGame("Your Score: " + Variables.getScore());
        addObject(d, getWidth() /2, getHeight()/2);
        
        display d2 = new display();
        d2.updateGame("You Played for " + Variables.getTime() + " seconds!");
        addObject(d2, getWidth() /2, getHeight()/3);
        
    }
    
}
