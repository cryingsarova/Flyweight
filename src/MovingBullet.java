import java.awt.*;

public class MovingBullet {

    private Color color;
    private BulletType type;
    private static Image coneBullet = ImageLoader.getConeBullet();
    private static Image sphereBullet = ImageLoader.getSphereBullet();

    public MovingBullet( Color color, BulletType type) {
        this.color = color;
        this.type = type;
    }

    public void draw(Graphics g, int x, int y) {
        if (type == BulletType.SPHERE){
           g.drawImage(sphereBullet,x,y,60,40,null);
        }
        if (type == BulletType.CONE){
           g.drawImage(coneBullet,x,y,70,30,null);
        }

    }


}