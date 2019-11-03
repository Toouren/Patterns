package Audi;

import CarParts.Roof;

public class AudiRoof implements Roof {
    public void open() {
        System.out.println("На Audi опустилась крыша");
    }

    public void close() {
        System.out.println("На Audi поднялась крыша");
    }
}
