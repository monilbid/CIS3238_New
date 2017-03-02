package question_03;

import java.awt.Color;
import java.awt.Graphics2D;

public interface MoveableShape {

    /**
     * @param g2 the graphics context
     */
    void draw(Graphics2D g2, Color c);

    /**
     * Moves the shape by a given amount.
     *
     * @param dx the amount to translate in x-direction @param dy the amount to
     * translate in y-direction
     */
    void translate(int dx, int dy);
}
