import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,231,203);
        // Crab 1마리 (231, 203) 좌표에 추가
        
        for(int i=0; i<10;i++){
        addObject( new Worm(),Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
    }
        
       // Worm 10마리 랜덤 좌표에 추가
        Lobster lobster1 = new Lobster();
        Lobster lobster2 = new Lobster();// Lobster 3마리 추가
        Lobster lobster3 =new Lobster();
   
        addObject(lobster1,334,65);
        addObject(lobster2,481,481);
        addObject(lobster3,79,270);
        // 각 좌표는 (334, 65), (481, 481), (79, 270)
       
        Turtle turtle = new Turtle(100);
        addObject(turtle,Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        turtle.act();
        // 100을 세고 움직이는 Turtle 추가
        // 좌표는 랜덤
    }
}
