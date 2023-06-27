package v1;

public class EventTicket {

    private String name;
    private int price;

    private Footer footer;
    private Header header;

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
        header.printHeader();

        System.out.println("---------------");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("---------------");

        footer.printFooter();
    }

    public Footer getFooter() {
        return footer;
    }

    public void setFooter(Footer footer) {
        this.footer = footer;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }
}
