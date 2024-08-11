public class Sensor {
private double currentValue;
private double thresholdValue = 25;
public Sensor(double currentValue, double thresholdValue) {
    this.currentValue = currentValue;
    this.thresholdValue = thresholdValue;
}

public void setCurrentValue(double currentValue) {
this.currentValue = currentValue;
}

public double getCurrentValue() {
return currentValue;
}

public boolean checkSensor() {
    return currentValue>=thresholdValue;
}


}
