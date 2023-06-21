package v2;

public class MaintenanceVisitor implements AutoElementVisitor {

    @Override
    public void visitBody(Body body) {
        System.out.println("Maintaining the body...");
    }

    @Override
    public void visitEngine(Engine engine) {
        System.out.println("Maintaining the engine...");
    }

    @Override
    public void visitWheel(Wheel wheel) {
        System.out.println("Maintaining the wheel...");
    }

    @Override
    public void visitCar(Car car) {
        System.out.println("Maintaining the car...");

        for (AutoElement element: car.getElements()){
            element.accept(this);
        }
    }
}
