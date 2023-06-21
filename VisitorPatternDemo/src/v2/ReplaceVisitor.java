package v2;

public class ReplaceVisitor implements AutoElementVisitor{

    @Override
    public void visitBody(Body body) {
        System.out.println("Replacing the body...");
    }

    @Override
    public void visitEngine(Engine engine) {
        System.out.println("Replacing the engine...");
    }

    @Override
    public void visitWheel(Wheel wheel) {
        System.out.println("Replacing the wheel...");
    }

    @Override
    public void visitCar(Car car) {
        System.out.println("Replacing the car...");
    }
}
