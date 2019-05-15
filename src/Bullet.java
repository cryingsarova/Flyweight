import java.awt.*;

public class Bullet {
    private int x;
    private int y;
    private MovingBullet type;

    public Bullet(int x, int y, MovingBullet type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}