package Map;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 * Purpose: 
 * @Date
 * @author Davin
 * Teacher: Mr. Wachs
 */
public class Visual extends JFrame{

    public static World world; //world display
    
    public int width;//frames width
    public int height;//frames height
    
    public Visual() {
        this.setSize(1280, 720);//build frame
        width = this.getWidth();
        height = this.getHeight();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false); 
        
        this.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //System.out.println(e.getKeyCode());
                world.keyInput(e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        
    }
    /**
     * makes and adds world
     */
    public void makeWorld(){
        world = new World();
        this.add(world);
        world.setVisible(true);
    }
    
}
