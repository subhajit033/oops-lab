import javax.swing.*;
import java.awt.*;

public class ShapeDrawerApplet extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a circle
        g.setColor(Color.RED);
        g.drawOval(50, 50, 100, 100);

        // Draw an ellipse
        g.setColor(Color.BLUE);
        g.drawOval(200, 50, 150, 100);

        // Draw a rectangle
        g.setColor(Color.GREEN);
        g.drawRect(50, 200, 150, 100);

        // Fill the shapes

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shape Drawer");
        ShapeDrawerApplet panel = new ShapeDrawerApplet();

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
