package application;

public class StandardSensor implements Sensor{
    private int time;

    public StandardSensor(int time) {
        this.time = time;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
        return;
    }

    @Override
    public void setOff() {
        return;
    }

    @Override
    public int read() {
        return this.time;
    }
    
}
