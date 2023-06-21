package v3;

public class Image2D implements Widget {

    private String imageURL;

    public void render(){
        System.out.println("Download the image and render it.");
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
