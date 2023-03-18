package application;
import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensorList;
    private List<Integer> tempReadings;

    public AverageSensor() {
        this.sensorList = new ArrayList<>();
        this.tempReadings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensorList.add(toAdd);

    }

    @Override
    public boolean isOn() {
        Boolean on = true;
        for (Sensor sensors : this.sensorList) {
            if (!sensors.isOn()) {
                on = false;
                return on;
            }
        }
        return on;
    }

    @Override
    public void setOn() {
        for (Sensor sensors : this.sensorList) {
            sensors.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensors : this.sensorList) {
            sensors.setOff();
        }
    }

    @Override
    public int read() {
        int average = 0;
        if (this.sensorList.size() == 0) {
            throw new IllegalStateException("Array empty");
        }
        for (Sensor sensors : this.sensorList) {
            average += sensors.read();
        }
        int result = average / this.sensorList.size();
        tempReadings.add(result);
        return result;
    }

    public List<Integer> readings() {
        return this.tempReadings;
    }
    
}
