import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class BulletTypeFactory {
    static Map<BulletType, MovingBullet> bulletTypes = new HashMap<>();

    public static MovingBullet getBulletType(Color color, BulletType type) {
        MovingBullet result = bulletTypes.get(type);
        if (result == null) {
            result = new MovingBullet(color, type);
            bulletTypes.put(type, result);
        }
        return result;
    }
}