package Audi;

import CarFactory.CarFactory;
import CarParts.Door;
import CarParts.Engine;
import CarParts.Roof;

public class AudiFactory implements CarFactory {
    public Engine createEngine() {
        return new AudiEngine();
    }

    public Roof createRoof() {
        return new AudiRoof();
    }

    public Door createDoor() {
        return new AudiDoor();
    }
}
