
package application;
import java.util.Random;

public class TemperatureSensor implements Sensor{
    private Boolean on;

    public TemperatureSensor() {
        this.on = false;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void setOn() {
        this.on = true;
    }

    @Override
    public void setOff() {
        this.on = false;
    }

    @Override
    public int read() {
        if (this.on) {
            return new Random().nextInt(60)-30;
        } else {
            throw new IllegalStateException("Not on");
        }
    }
    
}
