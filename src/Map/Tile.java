/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *Controls the info and most of the mechanics around the terrain tiles
 * 
 * @author Davin
 */
class Tile extends JLabel{

    
    public int x;//tile's location
    public int y;
    public int tileType;//the tile's type

    public Tile(int i, int j) {
        x = i; y = j;//stores location
        this.setSize(50, Map.World.tileSize);//sets bounds
        this.setLocation((x * Map.World.tileSize), (y * Map.World.tileSize));
        this.setBackground(Color.red);
        
    }
    /**
     * sets the tile to the given type
     * @param type: the new type of the tile 
     */
    public void setTile(int type) {
        tileType = type;//stores new type
        if (type == 0 ){//grass
            Icon tile = new ImageIcon("src\\Resources\\Tiles\\GrassTile1.png");
            this.setIcon(tile);
        }
        if (type == 1){//dessert
            Icon tile = new ImageIcon("src\\Resources\\Tiles\\DessertTile1.png");
            this.setIcon(tile);
        }
        if (type == 2){//water
            Icon tile = new ImageIcon("src\\Resources\\Tiles\\WaterTile1.png");
            this.setIcon(tile);
        }
        if (type == 3){//border
            Icon tile = new ImageIcon("src\\Resources\\Tiles\\BorderTile1.png");
            this.setIcon(tile);
        }
    }
    /**
     * get the type id of tile 
     * @return the type id  
     */
    static public int getTileType(Tile tile) {
      return tile.tileType;
    }
    
    public static boolean typeTraversible(int type){
        if (type == 0 ){//grass
            return true;
        }
        if (type == 1){//dessert
            return true;
        }
        if (type == 2){//water
            return false;
        }
        if (type == 3){//border
            return false;
        }
        return false;
    } 
    
}
