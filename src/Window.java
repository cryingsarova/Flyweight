import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Window extends JFrame {
    private List<Bullet> bullets = new ArrayList<>();

    public void addBullet(int x, int y, Color color, BulletType type) {
        MovingBullet movingBullet = BulletTypeFactory.getBulletType(color, type);
        Bullet bullet = new Bullet(x, y, movingBullet);
        bullets.add(bullet);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Bullet bullet : bullets) {
            bullet.draw(graphics);
        }
    }
}