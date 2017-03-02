//
//  ANSWER TO QUESTION 4.14 FROM HORSTMANN BOOK
//
package question_03;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import javafx.scene.shape.Ellipse;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ObservablePattern {

    public static java.awt.Color color = java.awt.Color.RED;
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        JButton redButton = new JButton("Red");
        JButton greenButton = new JButton("Green");
        JButton blueButton = new JButton("Blue");

        final MoveableShape ellipse = new Shape(0, 0, 100);

        ShapeIcon shape = new ShapeIcon(ellipse, 100, 100);
        
        
        final int FIELD_WIDTH = 20;
        JTextField textField = new JTextField(FIELD_WIDTH);
        textField.setText("Click a button!");
        final JLabel label = new JLabel(shape);
        
        label.repaint();
        
        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(redButton);
        frame.add(greenButton);
        frame.add(blueButton);
        frame.add(textField);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        redButton.addActionListener((ActionEvent event) -> {
            // Buttonactiongoeshere
            textField.setText("Red!");
            color = Color.RED;
            shape.setColor(color);
            label.repaint();
        });

        greenButton.addActionListener((ActionEvent event) -> {
            textField.setText("Green!");
            color = Color.GREEN;
            shape.setColor(color);
            label.repaint();
        });

        blueButton.addActionListener((ActionEvent event) -> {
            textField.setText("Blue!");
            color = Color.BLUE;
            shape.setColor(color);
            label.repaint();
        });
    }
}
