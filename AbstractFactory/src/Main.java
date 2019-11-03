import Audi.AudiFactory;
import BMW.BmwFactory;
import CarFactory.CarFactory;
import CarParts.Car;
import CarParts.Door;
import CarParts.Engine;
import CarParts.Roof;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] strings) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Если вы хотите создать Audi введите 1, в любом другом случае создается BMW");
        String option = reader.readLine();

        CarFactory carFactory;
        Car createdCar;

        if (option.equals("1")) {
            carFactory = new AudiFactory();
        } else {
            carFactory = new BmwFactory();
        }

        Door door = carFactory.createDoor();
        Engine engine = carFactory.createEngine();
        Roof roof = carFactory.createRoof();
        createdCar = new Car(engine, door, roof);
        createdCar.useCar();
    }
}
