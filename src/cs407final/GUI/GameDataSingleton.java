/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs407final.GUI;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrew
 */
public class GameDataSingleton {
    
    private static GameDataSingleton instance;
    private List<String> customAnimals;
    private int[] concreteAnimals;
    private int[] disasterChances;
    private int gameWidth;
    private int gameHeight;
    
    private GameDataSingleton() {
        
    }
    
    public static GameDataSingleton getInstance() {
        if(instance == null)
            instance = new GameDataSingleton();
        return instance;
    }
    public void setBoardSize(int width, int height) {
        gameWidth = width;
        gameHeight = height;
    }
    
    public void setAnimals(int[] concreteAnimals, List<String> customAnimals) {
        this.concreteAnimals = concreteAnimals;
        this.customAnimals = customAnimals;
    }
    /** Disaster chances array has the chances sorted as follows:
     *  Volcanic eruption chance, noxious gas chance, hurricane chance,
     *  typhoon chance, earthquake chance.
     * 
     * @param disasterChances 
     */
    public void setChances(int[] disasterChances) {
        this.disasterChances = disasterChances;
    }
    
    public int[] getBoardSize() {
        int[] size = {gameWidth, gameHeight};
        return size;
    }
    
    public int[] getConcreteAnimals() {
        return concreteAnimals;
    }
    
    public List<String> getCustomAnimals() {
        return customAnimals;
    }
    
    public int[] getDisasterChances() {
        return disasterChances;
    }
}
