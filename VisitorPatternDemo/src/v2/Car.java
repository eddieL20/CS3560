package v2;

import java.util.List;

public class Car implements AutoElement {

    private List<AutoElement> elements;

    public List<AutoElement> getElements() {
        return elements;
    }

    public void setElements(List<AutoElement> elements) {
        this.elements = elements;
    }

    @Override
    public void accept(AutoElementVisitor visitor) { visitor.visitCar(this); }
}
