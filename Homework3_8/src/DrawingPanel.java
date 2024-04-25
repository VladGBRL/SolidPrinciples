import javax.swing.*;
import java.awt.*;
class DrawingPanel extends JPanel {
    private ShapeDrawer shapeDrawer;

    public DrawingPanel(ShapeDrawer shapeDrawer) {
        this.shapeDrawer = shapeDrawer;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        shapeDrawer.drawShape(new Rectangle(), g2d);
    }
    public void setShapeDrawer(ShapeDrawer shapeDrawer) {
        this.shapeDrawer = shapeDrawer;
    }
}