import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageLoader {
    public static Image getConeBullet() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("C:\\Users\\shdas\\IdeaProjects\\flyweight\\cone.png"));
        } catch (IOException e) {

            e.printStackTrace();
        }
        return img;

    }
    public static Image getSphereBullet() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("C:\\Users\\shdas\\IdeaProjects\\flyweight\\sphere.png"));
        } catch (IOException e) {

            e.printStackTrace();
        }
        return img;

    }
}
