package v1;

public class Body implements AutoElement {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void doMaintenance(){
        System.out.println("Maintaining the body of the car...");
    }

    public void checkRecall(){
        System.out.println("Checking and if there are any recalls for the body of the car...");
    }

    public void upgrade(){
        System.out.println("Ordered an upgrade...");
    }

    @Override
    public void replace() {
        System.out.println("Replacing the body...");
    }
}
