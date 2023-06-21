package v2;

public class UpgradeVisitor implements AutoElementVisitor{

    @Override
    public void visitBody(Body body) {
        System.out.println("Upgrading the body of the car...");
    }

    @Override
    public void visitEngine(Engine engine) {
        System.out.println("Upgrading the body of the engine...");
    }

    @Override
    public void visitWheel(Wheel wheel) {
        System.out.println("Upgrading the body of the wheel...");
    }

    @Override
    public void visitCar(Car car) {
        System.out.println("Upgrading the body of the car...");

        for (AutoElement element: car.getElements()){
            element.accept(this);
        }
    }
}
