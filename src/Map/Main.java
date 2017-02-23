/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.awt.Point;

/**
 * Temp Class
 * @author Davin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static Visual visual;
    public static Person player;
    
    public static void main(String[] args) {
        
        player = new Person(new Point(13, 7));
        
        visual = new Visual();
        visual.setVisible(true);
        
        Main.visual.makeWorld();
    }
    
}
