package v3;

import java.util.List;

public class Window implements Widget {

    private List<Widget> widgets;

    public void render(){
        System.out.println("Opening the window and display all the widgets included.");
        if (widgets != null) {
            for (Widget widget : widgets) {
                widget.render();
            }
        }
    }

    public List<Widget> getWidgets() {
        return widgets;
    }

    public void setWidgets(List<Widget> widgets) {
        this.widgets = widgets;
    }
}
