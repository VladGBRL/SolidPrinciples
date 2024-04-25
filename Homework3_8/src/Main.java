import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Shape Drawer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // Center the frame

        DrawingPanel drawingPanel = new DrawingPanel(new GuiShapeDrawer(null));
        frame.getContentPane().add(drawingPanel);

        // Set the graphics object for the GuiShapeDrawer
        Graphics2D g2d = (Graphics2D) drawingPanel.getGraphics();
        drawingPanel.setShapeDrawer(new GuiShapeDrawer(g2d));

        frame.setVisible(true);
    }
}