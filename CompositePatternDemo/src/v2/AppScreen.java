package v2;

import java.util.List;

public class AppScreen {

    // Windows
    // Widgets

    private List<Window> windows;
    private List<Widget> widgets;

    public List<Window> getWindows() {
        return windows;
    }

    public void setWindows(List<Window> windows) {
        this.windows = windows;
    }

    public List<Widget> getWidgets() {
        return widgets;
    }

    public void setWidgets(List<Widget> widgets) {
        this.widgets = widgets;
    }

    public void startAppScreen(){
        if(windows != null){
            for (Window window : windows) window.openWindow();
        }

        if (windows != null){
            for (Widget widget : widgets) widget.render();
        }
    }
}
