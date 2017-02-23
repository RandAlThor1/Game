package Map;

import java.awt.Container;
import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Purpose: 
 * @Date
 * @author Davin
 * Teacher: Mr. Wachs
 */
class World extends Container{
    public static boolean moveEnabled = true;
    public static int downOff = 0;
    public static int rightOff = 0;
    
    public static int x,y;//the width and height of the display, in tiles
    public static Tile[][] grid;//the storage for the tile grid
    public static int[][] tileType;//the types for the tile grid
    
    public static int tileSize = 50;
    
    final int WIDTH = 50;//the grid width and height
    final int HEIGHT = 50;
    
    public double freeX = 0;
    public double freeY = 0;
    
    public World() {
        this.setBounds(0, 0, 1280, 720);
        this.setVisible(false);
        this.setLayout(null);
        
        x = (Main.visual.width/tileSize)+1;//makes the displays width and height
        y = (Main.visual.height/tileSize)+1;
        
        tileType  = new int[WIDTH][HEIGHT];//intializes all the grids
        grid  = new Tile[WIDTH][HEIGHT];
                
        File map = new File("src\\Map\\TestMap.txt");//reads the map and stores it in tileType, also sets all borderType to 0
        Scanner s;
        try {
            s = new Scanner(map);
            for (int j = 0; j < HEIGHT; j++){
                for (int i = 0; i < WIDTH; i++){
                    tileType[i][j] = s.nextInt();
                }
            }
            s.close(); 
        } catch (FileNotFoundException ex) {
            System.out.println("Error reading map");
        }
        
        
        for (int i = rightOff; i < WIDTH-1; i++){
            for (int j = downOff; j < HEIGHT-1; j++){
                grid[i][j] = new Tile(i, j);//creates all the tiles
                grid[i][j].setTile(tileType[i][j]);//sets the type of all tiles
                this.add(grid[i][j]);//adds the tiles to the tile container
                
            }
        }
        
        this.add(Main.player.jPanel,0);
    }

    void keyInput(int key) {
        if(moveEnabled){//map movement
            
            if (key == 38){//up
                if (downOff != 0 && Tile.typeTraversible(tileType[13 + rightOff][7 + downOff-1])){
                    //downOff--;
                    freeY -= 0.4;
                    while((freeY)<= -1 ){
                        downOff--;
                        freeY++;
                    }
                    redrawMap();
                }
            }
            if (key == 37){//left
                if (rightOff != 0 && Tile.typeTraversible(tileType[13 + rightOff-1][7 + downOff])){
                    //rightOff--;
                    freeX -= 0.4;
                    while((freeX)<= -1 ){
                        rightOff--;
                        freeX++;
                    }
                    redrawMap();
                }
            }
            if (key == 40){//down

                if (downOff != (HEIGHT-y) && Tile.typeTraversible(tileType[13 + rightOff][7 + downOff+1])){
                    //downOff++;   
                    freeY += 0.4;
                    while((freeY)>= 1 ){
                        downOff++;
                        freeY--;
                    }
                    redrawMap();
                }
            }
            if (key == 39){//right

                if (rightOff != (WIDTH-x) && Tile.typeTraversible(tileType[13 + rightOff+1][7 + downOff])){
                    //rightOff++;
                    freeX += 0.4;
                    while((freeX)>= 1 ){
                        rightOff++;
                        freeX--;
                    }
                    redrawMap();   
                }
            }
        }
    }
     /**
     * redraws the map 
     */
    public void redrawMap(){
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                grid[i][j].setTile(tileType[i + rightOff][j + downOff]);
                grid[i][j].setLocation(i*tileSize-(int)(tileSize*freeX), j*tileSize-(int)(tileSize*freeY));
            }
        }
    }
}
