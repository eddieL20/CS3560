package v3;

public class TextArea implements Widget {

    private String text;

    public void render(){
        System.out.println("Showing the text area");
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
