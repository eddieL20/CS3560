package v2;

public class FooterDecorator2 extends TicketDecorator{

    public FooterDecorator2(Component component) {
        super(component);
    }

    public void printFooter() {
        System.out.println("*******************************************************");
        System.out.println("V2 Future Event: Dec 10th, 2020, All-Star Game Presales");
        System.out.println("*******************************************************");
    }

    @Override
    public void printTicket() {
        getComponent().printTicket();
        printFooter();
    }
}
