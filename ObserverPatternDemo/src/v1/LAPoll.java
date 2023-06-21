package v1;

public class LAPoll extends Subject{

    private String name;
    private String percent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
        notifyObservers();
    }
}
