package v1;

public class Image2D {

    private String imageURL;

    public void renderImageWithUrl(){
        System.out.println("Download the image and render it.");
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
