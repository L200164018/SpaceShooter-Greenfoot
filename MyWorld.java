import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
      super(1080, 600, 1, true); 
      addObject (new Roket(), getWidth()/2,getHeight()/2);
      Variables.startTimer();
        }
 public void act(){
        if (getObjects(display.class) != null){
            removeObjects(getObjects(display.class));
        }
        
        display d = new display();
        d.updateText("Score", Variables.getScore());
        addObject(d, d.getImage().getWidth(), d.getImage().getHeight());
        
        display d2 = new display();
        d2.updateText("Health", Variables.getHealth());
        addObject(d2, d.getImage().getWidth(), d2.getImage().getHeight() * 2);
        
        display d3 = new display();
        d3.updateText("Time", Variables.getTime());
        addObject(d3, d.getImage().getWidth(), d2.getImage().getHeight() * 3);
        
        int x =Greenfoot.getRandomNumber(getWidth());
        int y =0;
        if (Greenfoot.getRandomNumber(2) == 1){
            y = getHeight();
        }else{
            y = 0;
        }
        if (Greenfoot.getRandomNumber(100) <= 10){
            Meteor m = new Meteor();
            addObject(m, x, y);
            m.initiate();
        }        
    }
}
