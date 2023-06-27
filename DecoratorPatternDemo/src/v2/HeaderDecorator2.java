package v2;

public class HeaderDecorator2 extends TicketDecorator{

    public HeaderDecorator2(Component component) {
        super(component);
    }

    public void printHeader(){
        System.out.println("V2 Sponsored by " + "Cal Poly Pomona");
    }

    @Override
    public void printTicket() {
        printHeader();
        getComponent().printTicket();
    }
}
