import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bullet(){
    
       getImage().scale(35,17);
    }
    public void act() 
    {
        move(5);
        
        if (getOneIntersectingObject(Meteor.class) != null){
            
            Variables.updateScore(1);
            getWorld().removeObject(getOneIntersectingObject(Meteor.class));
            getWorld().removeObject(this);
        }else{
            if (getX() > getWorld().getWidth() - 10 || getX() <= 0 || getY() <= 0 || getY() > getWorld().getHeight() -10){
             getWorld().removeObject(this);
            }   
        }
    }    
    }    

