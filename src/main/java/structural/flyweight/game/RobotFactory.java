package structural.flyweight.game;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    private static Map<String, IRobot> roboticObjectCache = new HashMap<>();

    public static IRobot createRobot(String robotType) {

        if (!roboticObjectCache.containsKey(robotType)) {

            if (robotType.equals("HUMANOID")) {
                Sprites sprites = new Sprites();
                HumanoidRobot humanoidRobot = new HumanoidRobot(robotType, sprites);
                roboticObjectCache.put(robotType, humanoidRobot);
            } else if (robotType == "ROBOTICDOG") {
                Sprites roboticDogSprite = new Sprites();
                IRobot roboticDogObject = new RoboticDog(robotType, roboticDogSprite);
                roboticObjectCache.put(robotType, roboticDogObject);
                return roboticDogObject;
            }
        }

        return roboticObjectCache.get(robotType);
    }
}
