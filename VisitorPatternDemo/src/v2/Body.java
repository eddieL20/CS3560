package v2;

public class Body implements AutoElement {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void accept(AutoElementVisitor visitor) {
        visitor.visitBody(this);
    }
}
