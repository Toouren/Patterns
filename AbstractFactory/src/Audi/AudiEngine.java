package Audi;

import CarParts.Engine;

public class AudiEngine implements Engine {
    public void startUp() {
        System.out.println("Двигатель Audi завелся");
    }

    public void drownOut() {
        System.out.println("Двигатель Audi заглох");
    }
}
