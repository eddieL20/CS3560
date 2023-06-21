package v2;

import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {
        Engine e1 = new Engine();
        Wheel w1 = new Wheel();
        Wheel w2 = new Wheel();
        Wheel w3 = new Wheel();
        Wheel w4 = new Wheel();
        Body b1 = new Body();

        Car c1 = new Car();
        c1.setElements(Arrays.asList(e1, w1, w2, w3, w4, b1));

        AutoElementVisitor checkRecall = new CheckRecallVisitor();
        AutoElementVisitor upgrade = new UpgradeVisitor();
        AutoElementVisitor replace = new ReplaceVisitor();
        e1.accept(checkRecall);
        e1.accept(upgrade);

        c1.accept(checkRecall);
        c1.accept(upgrade);
        c1.accept(replace);
    }
}
