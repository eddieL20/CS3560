package v2;

public interface AutoElementVisitor {

    void visitBody(Body body);
    void visitEngine(Engine engine);
    void visitWheel(Wheel wheel);
    void visitCar(Car car);
}
