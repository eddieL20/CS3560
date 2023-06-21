package v1;

public class Wheel implements AutoElement {

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void doMaintenance() {
        System.out.println("Maintaining the wheels...");
    }

    @Override
    public void checkRecall() {
        System.out.println("Checking recalls for wheels...");
    }

    @Override
    public void upgrade() {
        System.out.println("Upgrade the wheels...");
    }

    @Override
    public void replace() {
        System.out.println("Replacing the wheels...");
    }
}
