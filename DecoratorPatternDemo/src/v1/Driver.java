package v1;

public class Driver {

    public static void main(String[] args) {
        EventTicket eventTicket = new EventTicket();
        eventTicket.setName("Lakers vs Houston");
        eventTicket.setPrice(50);

        Footer footer = new FooterDecorator2();
        Header header = new HeaderDecorator2();

        eventTicket.setFooter(footer);
        eventTicket.setHeader(header);

        eventTicket.printTicket();
    }
}
