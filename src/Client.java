import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class Client {
    static int X = 800;
    static int Y = 600;
    static int BULLETS = 1000000;
    static int BULLET_TYPES = BulletType.values().length;
    static Random random = new Random();

    public static void main(String[] args) {
        Window window = new Window();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        for (int i = 0; i < Math.floor(BULLETS/BULLET_TYPES); i++) {
            window.addBullet(random.nextInt(X), random.nextInt(Y), Color.BLACK, BulletType.SPHERE);
            window.addBullet(random.nextInt(X), random.nextInt(Y), Color.ORANGE, BulletType.CONE);
        }
        window.setSize(X, Y);
        window.setVisible(true);
    }

}