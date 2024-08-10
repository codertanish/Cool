public class SensorRobot {
    Sensor distanceSensor = new Sensor(5, 10);
    RobotAction drive = new RobotAction();


public static void main(String[] args) {
    SensorRobot myRobot = new SensorRobot();
    
    System.out.println("Threshold Reached: " + myRobot.distanceSensor.checkSensor());
    myRobot.distanceSensor.setCurrentValue(10);
    System.out.println("Current Value: " + myRobot.distanceSensor.getCurrentValue());
    System.out.println("Threshold Reached: " + myRobot.distanceSensor.checkSensor());
    myRobot.drive.action(myRobot.distanceSensor.checkSensor());

}

}
