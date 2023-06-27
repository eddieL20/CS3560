package v2;

public class EventTicket implements Component{

    private String name;
    private int price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printTicket(){
        System.out.println("---------------");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("---------------");
    }

}
