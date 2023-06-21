package v1;

public class FacebookApp {

    public static void main(String[] args) {

        AndroidCamera.getInstance().takePicture();
        AndroidCamera.getInstance().recordVideo("ff");

    }
}
