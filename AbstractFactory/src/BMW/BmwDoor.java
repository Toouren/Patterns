package BMW;

import CarParts.Door;

public class BmwDoor implements Door {
    public void open() {
        System.out.println("Дверь BMW открылась");
    }

    public void close() {
        System.out.println("Дверь BMW закрылась");
    }
}
