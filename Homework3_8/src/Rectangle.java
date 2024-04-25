import java.awt.*;
class Rectangle implements Shape {
    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.BLUE);
        g2d.fillRect(50, 50, 100, 50); // Rectangle: x, y, width, height
    }
}