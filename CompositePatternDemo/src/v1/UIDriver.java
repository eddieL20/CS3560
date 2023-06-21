package v1;

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

        Window appWindow = new Window();
        appWindow.setButtons(Arrays.asList(button1, button2));
        appWindow.setImages(List.of(image2D));
        appWindow.setMenuBars(List.of(menuBar));
        appWindow.setTextAreas(Arrays.asList(textArea1, textArea2));

        appWindow.openWindow();
    }
}
