package CarParts;

public class Car {

    Engine engine;
    Door door;
    Roof roof;

    public Car(Engine engine, Door door, Roof roof) {
        this.engine = engine;
        this.door = door;
        this.roof = roof;
    }

    public void useCar() {
        this.door.open();
        this.door.close();
        this.engine.startUp();
        this.roof.open();
        this.roof.close();
        this.engine.drownOut();
        this.door.open();
        this.door.close();
    }
}
