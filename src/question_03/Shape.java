package question_03;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Shape implements MoveableShape {

    /**
     * Constructs a car item.
     *
     * @param x the left of the bounding rectangle @param y the top of the
     * bounding rectangle @param width the width of the bounding rectangle
     */
    public Shape(int x, int y, int width) {
        this.x = x;
        this.y = y;
        this.width = width;
    }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void draw(Graphics2D g2, Color c) {
        Ellipse2D.Double ellipse = new Ellipse2D.Double(x, y, width, width);
        
        g2.draw(ellipse);
        g2.setColor(c);
        g2.fill(ellipse);
    }
    private int x;
    private int y;
    private final int width;

}
