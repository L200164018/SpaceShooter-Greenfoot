import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Meteor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meteor extends Actor
{
    /**
     * Act - do whatever the Meteor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Meteor(){
        getImage().scale(60,60);
    }
     // Add your action code here.
    public void act() 
    {
        // Add your action code here
        move(2);
        if (getX() > getWorld().getWidth() - 2 || getX() <= 0 || getY() <= 0 || getY() > getWorld().getHeight() -2){
            getWorld().removeObject(this);
        }
    }    
    public void initiate(){
        double tempAngle = Math.atan2(Variables.getPlayerX() - getX(), Variables.getPlayerY() - getY()) * 180/Math.PI;
        setRotation(Greenfoot.getRandomNumber(360));
    }}
