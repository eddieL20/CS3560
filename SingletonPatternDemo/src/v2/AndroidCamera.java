package v2;

public class AndroidCamera {

    private static AndroidCamera pointer;

    private AndroidCamera(){ System.out.println("Constructor called!"); }

    // "double-checked locking"
    public static AndroidCamera getInstance(){
        if (pointer == null){
            synchronized (AndroidCamera.class){
                if (pointer == null) {
                    pointer = new AndroidCamera();
                }
            }
        }
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
