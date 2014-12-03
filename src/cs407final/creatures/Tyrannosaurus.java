/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs407final.creatures;


/**
 *
 * @author Bear
 */
public class Tyrannosaurus extends Animal{

    @Override
    protected void burnCalories() {
        this.Energy = this.Energy - 18;
    }
    
}
