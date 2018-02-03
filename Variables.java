import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.Timer;
import java.awt.event.*;
/**
 * Write a description of class Variable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Variables extends Actor
{
   public static int Score = 0;
   public static int Health = 100;
   public static int playerX;
   public static int playerY;
   public static int timeSurvived = 0;
   
   
     private static Timer secondCounter = new Timer(1000, new ActionListener(){
      public void actionPerformed(ActionEvent e){
          timeSurvived ++;
        
    }});
    public void act() 
    {
        // Add your action code here.
    }    
    public static void startTimer(){
        secondCounter.start();
    }
    public static void stopTimer(){
        secondCounter.stop();
    }
    public static int getTime(){
        return timeSurvived;
    }
    public static void updatePlayerX(int amount){
        playerX = amount;
    }
    public static void updatePlayerY(int amount){
        playerY = amount;
    }
    public static int getPlayerX(){
        return playerX;
    }
    public static int getPlayerY(){
        return playerY;
    }
    public static int getScore(){
        return Score;
    }
    public static int getHealth(){
        return Health;
    }
    public static void updateScore(int amount){
        Score += amount;
    }
    public static void updateHealth(int amount){
        Health += amount;
    }
   
}
