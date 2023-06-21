package v1;

public class Engine implements AutoElement {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void doMaintenance() {
        System.out.println("Maintaining the engine of the car...");
    }

    @Override
    public void checkRecall() {
        System.out.println("Checking and to see if there are any recalls for the engine of the car...");
    }

    @Override
    public void upgrade() {
        System.out.println("Ordered an upgrade...");
    }

    @Override
    public void replace() {
        System.out.println("Replacing the engine...");
    }
}
