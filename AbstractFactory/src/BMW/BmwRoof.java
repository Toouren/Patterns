package BMW;

import CarParts.Roof;

public class BmwRoof implements Roof {
    public void open() {
        System.out.println("На BMW опустилась крыша");
    }

    public void close() {
        System.out.println("На BMW поднялась крыша");
    }
}
