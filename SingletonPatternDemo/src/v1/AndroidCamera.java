package v1;

public class AndroidCamera {

    private static AndroidCamera pointer;

    private AndroidCamera(){}

    public static AndroidCamera getInstance(){
        if(pointer == null) pointer = new AndroidCamera();
        return pointer;
    }

    public void takePicture() {
        System.out.println("Taking a photo...");
        System.out.println("Saving the photo...");
    }

    public void recordVideo(String filePath){
        System.out.println("Recording the video at " + filePath);
    }
}
