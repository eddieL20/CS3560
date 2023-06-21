package v3;

import java.util.List;

public class GraphicalCanvas implements Widget{

    private List<Widget> widgets;

    @Override
    public void render() {
        System.out.println("Optimizing the graphics rendering...");
    }

    public List<Widget> getWidgets() {
        return widgets;
    }

    public void setWidgets(List<Widget> widgets) {
        this.widgets = widgets;
    }
}
