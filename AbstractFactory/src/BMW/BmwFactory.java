package BMW;

import CarParts.*;
import CarFactory.CarFactory;

public class BmwFactory implements CarFactory {
    public Engine createEngine() {
        return new BmwEngine();
    }

    public Roof createRoof() {
        return new BmwRoof();
    }

    public Door createDoor() {
        return new BmwDoor();
    }
}
