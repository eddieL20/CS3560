package v2;

public class CheckRecallVisitor implements AutoElementVisitor{

    @Override
    public void visitBody(Body body) {
        System.out.println("Checking the recall for body");
    }

    @Override
    public void visitEngine(Engine engine) {
        System.out.println("Checking the recall for engine");
    }

    @Override
    public void visitWheel(Wheel wheel) {
        System.out.println("Checking the recall for wheel");
    }

    @Override
    public void visitCar(Car car) {
        System.out.println("Checking the recall for car");

        for (AutoElement element: car.getElements()){
            element.accept(this);
        }
    }
}
