package v2;

import v1.FooterDecorator2;

public class FooterDecorator extends TicketDecorator {

    public FooterDecorator(Component component){
        super(component);
    }

    public void printTicket(){
        getComponent().printTicket();
        printFooter();
    }

    public void printFooter(){
        System.out.println("*****************************************************");
        System.out.println("Future Event: Dec 10th, 2020, All-Star Game Presales");
        System.out.println("*****************************************************");
    }
}
