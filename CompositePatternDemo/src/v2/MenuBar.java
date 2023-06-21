package v2;

public class MenuBar implements Widget{
    private int position_x;
    private int position_y;

    public int getPosition_x() {
        return position_x;
    }

    public void setPosition_x(int position_x) {
        this.position_x = position_x;
    }

    public int getPosition_y() {
        return position_y;
    }

    public void setPosition_y(int position_y) {
        this.position_y = position_y;
    }


    public void render(){
        System.out.println("Set and display menu bar.");
    }
}
