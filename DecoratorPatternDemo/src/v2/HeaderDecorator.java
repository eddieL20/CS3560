package v2;

public class HeaderDecorator extends TicketDecorator{

    public HeaderDecorator(Component component) {
        super(component);
    }

    @Override
    public void printTicket() {
        printHeader();
        getComponent().printTicket();
    }

    public void printHeader(){
        System.out.println("Sponsored by " + " Cal Poly Pomona");
    }
}
