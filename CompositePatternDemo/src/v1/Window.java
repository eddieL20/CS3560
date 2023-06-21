package v1;

import java.io.BufferedReader;
import java.util.List;

public class Window {

    private List<Button> buttons;
    private List<Image2D> images;
    private List<MenuBar> menuBars;
    private List<TextArea> textAreas;

    public void openWindow(){
        System.out.println("Opening the window and display all the widgets included.");
        if (buttons != null){
            for (Button button: buttons){
                button.renderButton();
            }
        }

        if (images != null){
            for(Image2D image: images){
                image.renderImageWithUrl();
            }
        }

        if (menuBars != null){
            for (MenuBar menuBar : menuBars) {
                menuBar.setAndDisplay();
            }
        }

        if (textAreas != null){
            for (TextArea textArea : textAreas) {
                textArea.showTextArea();
            }
        }
    }

    public List<Button> getButtons() {
        return buttons;
    }

    public void setButtons(List<Button> buttons) {
        this.buttons = buttons;
    }

    public List<Image2D> getImages() {
        return images;
    }

    public void setImages(List<Image2D> images) {
        this.images = images;
    }

    public List<MenuBar> getMenuBars() {
        return menuBars;
    }

    public void setMenuBars(List<MenuBar> menuBars) {
        this.menuBars = menuBars;
    }

    public List<TextArea> getTextAreas() {
        return textAreas;
    }

    public void setTextAreas(List<TextArea> textAreas) {
        this.textAreas = textAreas;
    }
}
