package Map;

import java.awt.Color;
import java.awt.Point;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Purpose: 
 * @Date
 * @author Davin
 * Teacher: Mr. Wachs
 */
class Person {

    public Point location;
    public Icon image;
    public JPanel jPanel;

    public Person(Point location) {
        this.location = location;
        this.image = new ImageIcon("src\\Resources\\MapImages\\Person1.png");
        
        this.jPanel = new JPanel(null);
        jPanel.setBackground(new Color(0,0,0,0));
        jPanel.setBounds((this.location.x)*50, (this.location.y)*50, 50, 50);
        JLabel icon = new JLabel(this.image);
        icon.setBounds(0, 0, 50, 50);
        this.jPanel.add(icon);

        
    }

}
