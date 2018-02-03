import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class display here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class display extends Actor
{
    /**
     * Act - do whatever the display wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public void updateText(String label, int variable){
        GreenfootImage img = new GreenfootImage(label + ": " + variable, 42, greenfoot.Color.WHITE, new Color(0,0,0,0));
        setImage(img);
    }
    public void updateGame(String txt){
        GreenfootImage img = new GreenfootImage(txt, 80, greenfoot.Color.WHITE, new Color(0,0,0,0));
        setImage(img);
    }
}
