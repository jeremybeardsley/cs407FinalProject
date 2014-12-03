
package cs407final.GUI;

import java.util.ArrayList;
import java.util.List;

/**
 * Class GameDataSingleton which stores data collected by the SettingsGUI form. 
 * The data contained here relates to options (such as number of animals, board size)
 * for the user to choose for playing the game.
 * @see SettingsGUI
 * 
 * @author Andrew
 */
public class GameDataSingleton {
    
    private static GameDataSingleton instance;
    private ArrayList<String> customAnimals;
    private int[] concreteAnimals;
    private int[] disasterChances;
    private int gameWidth;
    private int gameHeight;
    
    // Constructor for the Singleton.
    private GameDataSingleton() {
        
    }
    
    // Static method for retrieving an instance of the singleton.
    public static GameDataSingleton getInstance() {
        if(instance == null)
            instance = new GameDataSingleton();
        return instance;
    }
    
    /** 
     * Setter for the width and height of the game board.
     * 
     * @param width     Integer width, in tiles, of the game board.
     * @param height    Integer height, in tiles, of the game board.
     */
    public void setBoardSize(int width, int height) {
        gameWidth = width;
        gameHeight = height;
    }
    
    /** 
     * Setter for the number of animals, both concrete and custom.
     * 
     * @param concreteAnimals Integer array for the number of each animal to create.
     * @param customAnimals   String List containing the custom animal settings from 
     *                        the text file.
     */
    public void setAnimals(int[] concreteAnimals, ArrayList<String> customAnimals) {
        this.concreteAnimals = concreteAnimals;
        this.customAnimals = customAnimals;
    }
    /** 
     * Setter for the chances of each disaster to occur in the game.
     * Disaster chances array has the chances sorted as follows:
     *  Volcanic eruption chance, noxious gas chance, hurricane chance,
     *  typhoon chance, earthquake chance.
     * 
     * @param disasterChances Integer array containing the chances for each natural disaster.
     */
    public void setChances(int[] disasterChances) {
        this.disasterChances = disasterChances;
    }
    /** 
     * Getter for the width and height of the game board.
     * 
     * @return Integer array containing the width and height.
     */
    public int[] getBoardSize() {
        int[] size = {gameWidth, gameHeight};
        return size;
    }
    
    /**
     * Getter for the number of concrete animals to be created.
     * 
     * @return Integer array of concrete animal counts.
     */
    public int[] getConcreteAnimals() {
        return concreteAnimals;
    }
    
    /**
     * Getter for the custom animal options.
     * 
     * @return String List containing instructions for the user-created animals.
     */
    public ArrayList<String> getCustomAnimals() {
        return customAnimals;
    }
    
    /**
     * Getter for the percent chance of each natural disaster.
     * 
     * @return Integer array of natural disaster chances.
     */
    public int[] getDisasterChances() {
        return disasterChances;
    }
}
