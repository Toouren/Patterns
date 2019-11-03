package Audi;

import CarParts.Door;

public class AudiDoor implements Door {
    public void open() {
        System.out.println("Дверь Audi открылась");
    }

    public void close() {
        System.out.println("Дверь Audi закрылась");
    }
}
