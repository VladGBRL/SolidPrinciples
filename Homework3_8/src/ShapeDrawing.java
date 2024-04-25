import javax.swing.*;
import java.awt.*;

public class ShapeDrawing extends JFrame {

    public ShapeDrawing() {
        setTitle("Basic Shape Drawing");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawShape(g);
            }
        };

        getContentPane().add(panel);
    }

    private void drawShape(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLUE);
        g2d.fillRect(50, 50, 100, 50); // Rectangle: x, y, width, height
    }
}