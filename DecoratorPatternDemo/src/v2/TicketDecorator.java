package v2;

public abstract class TicketDecorator implements Component{

    private Component component;

    public TicketDecorator(Component component){
        super();
        this.component = component;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }
}
