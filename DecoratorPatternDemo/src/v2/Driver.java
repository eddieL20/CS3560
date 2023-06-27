package v2;

public class Driver {

    public static void main(String[] args) {
        EventTicket eventTicket = new EventTicket();
        eventTicket.setName("Lakers vs Houston");
        eventTicket.setPrice(50);

        TicketDecorator footer = new FooterDecorator(eventTicket);
        TicketDecorator header = new HeaderDecorator(footer);

        Component finalTicket =
                new FooterDecorator2(
                    new HeaderDecorator(
                        new FooterDecorator(eventTicket)));

        finalTicket.printTicket();
    }
}
