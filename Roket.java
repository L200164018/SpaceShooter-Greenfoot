import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.Timer;
import java.awt.event.*;
/**
 * Write a description of class Roket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Roket extends Actor
{
    /**
     * Act - do whatever the Roket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
            

    private int rotation = 0; //Current Rotation
    private boolean canFire = true;
    private GreenfootSound Song = new GreenfootSound("insertsong.mp3");
    private GreenfootSound laser = new GreenfootSound("laser.mp3");
    
    private Timer fireCooldown = new Timer(250, new ActionListener(){
      public void actionPerformed(ActionEvent e){

          if (canFire){
              
            }else{
                canFire = true;
            }
        }
    }
    );
    public Roket(){
        
        getImage().scale(75,75);
        fireCooldown.start();
    }
         public void act() 
    {
        checkKeys();
        Variables.updatePlayerX(getX());
        Variables.updatePlayerY(getY());
        setRotation(rotation);
        Song.play();
        
        if (getOneIntersectingObject(Meteor.class) != null){
            getWorld().removeObject(getOneIntersectingObject(Meteor.class));
            Variables.updateHealth(-10);
        }
        
               
        if (Variables.getHealth() <= 0){
            GreenfootSound lose = new GreenfootSound("lose.wav");
            lose.play();
            Song.stop();
            gameOver Ending = new gameOver();
            Greenfoot.setWorld(Ending);
            Greenfoot.stop();
            Variables.updateHealth(100);
            
        }

    }    
    public void checkKeys(){
        if (Greenfoot.isKeyDown("left")){
            rotation -= 5;
        }else if (Greenfoot.isKeyDown("right")){
            rotation += 5;
        }
        
        if (Greenfoot.isKeyDown("up")){
            move(4);
        }
        if (Greenfoot.isKeyDown("space") && canFire == true){
            laser.play();
            Bullet bullet = new Bullet();
            bullet.setRotation(rotation);
            getWorld().addObject(bullet, getX(), getY());
            canFire = false;
            
        }
    }
}

