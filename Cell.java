import java.awt.Graphics2D;
import java.awt.Color;

/**
 * Java. Classic Game Snake
 *
 * @author Sergey Kostsyk
 * @version 0.1 dated 10.02.2022
 */

public class Cell {
    private int x, y;
    private int size; // object size in px
    private Color color; // object color

    public Cell(int x, int y, int size, Color color) {
        set(x, y);
        this.size = size;
        this.color = color;
    }

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void paint(Graphics2D g) {
        g.setColor(color);
        g.fillOval(x * size, y * size, size, size);
    }

}