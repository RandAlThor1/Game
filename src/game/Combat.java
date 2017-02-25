/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Ben Allen
 */
public class Combat {
    //Logic for Combat between the player and enemies
    private int MaxFieldHeight = 2;
    private int MaxFieldWidth = 4;
    private static Creature[][] battle;

    public int getMaxFieldHeight() {
        return MaxFieldHeight;
    }

    public int getMaxFieldWidth() {
        return MaxFieldWidth;
    }

    private void CreateField() {
        battle = new Creature[getMaxFieldWidth()][getMaxFieldHeight()];
        for (int i = 0; i < getMaxFieldWidth(); i++) {
            for (int j = 0; j < getMaxFieldHeight(); j++) {
                battle[i][j] = new Creature();
            }
        }
    }
    
}
