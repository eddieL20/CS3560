package v0;

public class AndroidCamera {

    public void takePicture() {
        System.out.println("Taking a photo...");
        System.out.println("Saving the photo...");
    }

    public void recordVideo(String filePath){
        System.out.println("Recording the video at " + filePath);
    }
}
