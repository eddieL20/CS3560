package v1;

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
    public void doMaintenance() { for (AutoElement element: elements) element.doMaintenance(); }

    @Override
    public void checkRecall() { for (AutoElement element: elements) element.checkRecall(); }

    @Override
    public void upgrade() { for (AutoElement element: elements) element.upgrade(); }

    @Override
    public void replace() { for (AutoElement element: elements) element.replace(); }
}
