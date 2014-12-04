/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs407final;

import cs407final.creatures.Animal;
import cs407final.creatures.AnimalFactory;
import cs407final.creatures.InvalidArgumentException;
import cs407final.environment.Position;
import java.util.ArrayList;
import java.util.Random;

/**
 * Creatures Class creates a CreaturesArray that contains all the creatures 
 * used throughout the game. 
 * 
 * @author Jeremy Beardsley, Andrew McCoy, Matt LeClerc, Andrew Possardt
 * @version 1.0
 * @since 11-4-2014
 */
public class Creatures {


    public ArrayList<Animal> CreaturesArray = new ArrayList();
    public ArrayList<Position> usedSeedSpaces = new ArrayList();

    /**
     * Creates all of the creatures and add then to the CreaturesArray to be accessed
     * by other parts of the game.
     * 
     * @param cntAnt
     * @param cntBear
     * @param cntBun
     * @param cntHb
     * @param cntTrex
     * @param cntYeti
     * @param gb
     * @param custom
     * @throws InvalidArgumentException
     */
    public Creatures(int cntAnt,int cntBear,int cntBun,int cntHb,int cntTrex, int cntYeti, Board gb, ArrayList<String> custom) throws InvalidArgumentException{
        
        AnimalFactory af = AnimalFactory.getAnimalFactory();
        
        Random rn = new Random();
        //Antelope Creation
        for (int i = 0; i < cntAnt; i++) {
            Animal animal = af.createAnimal('a');
            setViablePosition(rn, gb.width, gb.height, usedSeedSpaces, animal);
            CreaturesArray.add(animal);
        }
        //Bunny Creation
        for (int i = 0; i < cntBun; i++) {
            Animal animal = af.createAnimal('r');
            setViablePosition(rn, gb.width, gb.height, usedSeedSpaces, animal);
            CreaturesArray.add(animal);
        }
        //Bear Creation
         for (int i = 0; i < cntBear; i++) {
            Animal animal = af.createAnimal('b');
            setViablePosition(rn, gb.width, gb.height, usedSeedSpaces, animal);
            CreaturesArray.add(animal);
        }
         //Trex Creation
          for (int i = 0; i < cntTrex; i++) {
            Animal animal = af.createAnimal('t');
            setViablePosition(rn, gb.width, gb.height, usedSeedSpaces, animal);
            CreaturesArray.add(animal);
        }
        //Yeti Creation
           for (int i = 0; i < cntYeti; i++) {
            Animal animal = af.createAnimal('y');
            setViablePosition(rn, gb.width, gb.height, usedSeedSpaces, animal);
            CreaturesArray.add(animal);
        }
           //HoneyBadgerCreation
            for (int i = 0; i < cntHb; i++) {
            Animal animal = af.createAnimal('h');
            setViablePosition(rn, gb.width, gb.height, usedSeedSpaces, animal);
            CreaturesArray.add(animal);
        }
        if(custom != null) {
            for (int i=0; i<custom.size(); i++) {
                String[] s = custom.get(i).split("\\s");
                Animal animal = af.createAnimal(s[0],
                                                Integer.parseInt(s[1]),
                                                Integer.parseInt(s[2]),
                                                Integer.parseInt(s[3]),
                                                Integer.parseInt(s[4]),
                                                Integer.parseInt(s[5]),
                                                Double.parseDouble(s[6]));
                setViablePosition(rn, gb.width, gb.height, usedSeedSpaces, animal);
                CreaturesArray.add(animal);
            }
        }
    }
    private static void setViablePosition(Random rn, int gameWidth, int gameHeight, ArrayList<Position> usedSeedSpaces, Animal an) {
        boolean viable = false;
        int posX = 0, posY = 0;
        while (!viable) {
            posX = rn.nextInt(100000)%gameWidth;
            posY = rn.nextInt(100000)%gameHeight;
            if (posX >= gameWidth){posX = gameWidth-1;}
            if (posY >= gameHeight){posY = gameHeight-1;}
            
            if(usedSeedSpaces.isEmpty()) viable = true;
            else {
                for (Position p : usedSeedSpaces) {
                    if (p.xCord == posX && p.yCord == posY)
                        viable = false;
                    else {
                        viable = true;
                        break;
                    }
                }
            }
        }
        an.setPosition(posX, posY);
        usedSeedSpaces.add(new Position(posX,posY));
    }
}
