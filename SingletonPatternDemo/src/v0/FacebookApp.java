package v0;

public class FacebookApp {

    public static void main(String[] args) {
        // FacebookApp and SnapchatApp using different cameras
        AndroidCamera camera1 = new AndroidCamera();
        camera1.takePicture();

        // This is a problem because you should not be able to create a new camera object
        AndroidCamera camera3 = new AndroidCamera();
        camera3.takePicture();

        System.out.println(camera1);
        System.out.println(camera3);
    }
}
