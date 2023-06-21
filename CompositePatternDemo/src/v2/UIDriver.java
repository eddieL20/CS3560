package v2;

import java.util.Arrays;
import java.util.List;

public class UIDriver {

    public static void main(String[] args) {
        Button button1 = new Button();
        Button button2 = new Button();

        Image2D image2D = new Image2D();
        image2D.setImageURL("cpp.edu/cs.jpg");

        MenuBar menuBar = new MenuBar();
        menuBar.setPosition_x(10);
        menuBar.setPosition_y(10);

        TextArea textArea1 = new TextArea();
        TextArea textArea2 = new TextArea();

        CheckBox cb = new CheckBox();

        Window appWindow = new Window();
        appWindow.setWidgets(Arrays.asList(button1, button2, image2D, menuBar, textArea1, textArea2, cb));
        appWindow.openWindow();
    }
}
