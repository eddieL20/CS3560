package v2;

public class DemoExample {

    public static void main(String[] args) {
        // multiple threads use the same Singleton class

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                AndroidCamera.getInstance().takePicture();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                AndroidCamera.getInstance().takePicture();
            }
        });

        t1.start();
        t2.start();
    }
}
