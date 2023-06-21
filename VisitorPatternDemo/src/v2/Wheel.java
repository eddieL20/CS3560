package v2;

public class Wheel implements AutoElement {

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void accept(AutoElementVisitor visitor) {
        visitor.visitWheel(this);
    }
}
