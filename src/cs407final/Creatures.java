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
 *
 * @author Bear
 */
public class Creatures {
    public ArrayList<Animal> CreaturesArray = new ArrayList();
    public Creatures(int cntAnt,int cntBear,int cntBun,int cntHb,int cntTrex, int cntYeti, Board gb) throws InvalidArgumentException{
                ArrayList<Position> usedSeedSpaces = new ArrayList();
        
        AnimalFactory af = AnimalFactory.getAnimalFactory();
        
        Random rn = new Random();
        //Antelope Creation
        for (int i = 0; i <= cntAnt; i++) {
            Animal animal = af.createAnimal('a');
            setViablePosition(rn, gb.width, gb.height, usedSeedSpaces, animal);
            CreaturesArray.add(animal);
        }
        //Bunny Creation
        for (int i = 0; i <= cntBun; i++) {
            Animal animal = af.createAnimal('r');
            setViablePosition(rn, gb.width, gb.height, usedSeedSpaces, animal);
            CreaturesArray.add(animal);
        }
        //Bear Creation
         for (int i = 0; i <= cntBear; i++) {
            Animal animal = af.createAnimal('b');
            setViablePosition(rn, gb.width, gb.height, usedSeedSpaces, animal);
            CreaturesArray.add(animal);
        }
         //Trex Creation
          for (int i = 0; i <= cntTrex; i++) {
            Animal animal = af.createAnimal('t');
            setViablePosition(rn, gb.width, gb.height, usedSeedSpaces, animal);
            CreaturesArray.add(animal);
        }
        //Yeti Creation
           for (int i = 0; i <= cntYeti; i++) {
            Animal animal = af.createAnimal('y');
            setViablePosition(rn, gb.width, gb.height, usedSeedSpaces, animal);
            CreaturesArray.add(animal);
        }
           //HoneyBadgerCreation
            for (int i = 0; i <= cntHb; i++) {
            Animal animal = af.createAnimal('h');
            setViablePosition(rn, gb.width, gb.height, usedSeedSpaces, animal);
            CreaturesArray.add(animal);
        }
    }
    private static void setViablePosition(Random rn, int gameWidth, int gameHeight, ArrayList<Position> usedSeedSpaces1, Animal an) {
        boolean viable = false;
        int posX = 0, posY = 0;
        while (!viable) {
            posX = rn.nextInt(gameWidth - 1) + 1;
            posY = rn.nextInt(gameHeight - 1) + 1;
            for (Position p : usedSeedSpaces1) {
                viable = !(p.xCord == posX && p.yCord == posY);
            }
        }
        an.setPosition(posX, posY);
    }
}