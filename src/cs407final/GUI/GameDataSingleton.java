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
    
    private GameDataSingleton instance;
    private List<String> customAnimals;
    private int[] concreteAnimals;
    private int gameWidth;
    private int gameHeight;
    
    protected GameDataSingleton() {
        
    }
    
    public GameDataSingleton getInstance() {
        if(instance == null)
            instance = new GameDataSingleton();
        return instance;
    }
    public void setAnimals(String[] concreteAnimals, ArrayList<String> customAnimals) {
        
    }
}
