//
//  ANSWER TO QUESTION 4.14 FROM HORSTMANN BOOK
//
package question_03;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.Icon;

public class ShapeIcon implements Icon {

    public Color color = Color.RED;
    
    public ShapeIcon(MoveableShape shape,
            int width, int height) {
        this.shape = shape;
        this.width = width;
        this.height = height;
    }

    public int getIconWidth() {
        return width;
    }

    public int getIconHeight() {
        return height;
    }
    
    public void setColor(Color c){
        color = c;
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g;
        shape.draw(g2, color);
    }

    private int width;
    private int height;
    private MoveableShape shape;
}
