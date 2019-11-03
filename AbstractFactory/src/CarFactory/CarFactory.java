package CarFactory;

import CarParts.*;

public interface CarFactory {
    Engine createEngine();
    Door createDoor();
    Roof createRoof();
}
