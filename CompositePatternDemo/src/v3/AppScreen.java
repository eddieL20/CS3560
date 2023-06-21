package v3;

import java.util.List;

public class AppScreen {

    private List<Widget> widgets;



    public List<Widget> getWidgets() {
        return widgets;
    }

    public void setWidgets(List<Widget> widgets) {
        this.widgets = widgets;
    }

    public void startAppScreen(){
        if (widgets != null){
            for (Widget widget : widgets) widget.render();
        }
    }
}
