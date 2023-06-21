package v2;

public class Engine implements AutoElement {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void accept(AutoElementVisitor visitor) { visitor.visitEngine(this); }
}