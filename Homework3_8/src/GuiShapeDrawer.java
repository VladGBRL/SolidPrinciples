import java.awt.*;
class GuiShapeDrawer implements ShapeDrawer {
    private Graphics2D g2d;

    public GuiShapeDrawer(Graphics2D g2d) {
        this.g2d = g2d;
    }

    @Override
    public void drawShape(Shape shape, Graphics2D g2d) {
        shape.draw(g2d);
    }
}