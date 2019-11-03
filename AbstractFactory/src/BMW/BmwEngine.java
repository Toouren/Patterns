package BMW;

import CarParts.Engine;

public class BmwEngine implements Engine {
    public void startUp() {
        System.out.println("Двигатель BMW завелся");
    }

    public void drownOut() {
        System.out.println("Двигатель BMW заглох");
    }
}
