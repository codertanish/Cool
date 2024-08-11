public class SensorRobot {
    Sensor distanceSensor = new Sensor(5, 10);
    RobotAction drive = new RobotAction();


public static void main(String[] args) { //I could remove the static from here, would this work?
    SensorRobot myRobot = new SensorRobot(); //I ended up just using the full class as an object.
    /*I also could have just added the following code here rather than outside of the main loop:
    Sensor distanceSensor = new Sensor(5, 10);
    RobotAction drive = new RobotAction();
    */
    
    System.out.println("Threshold Reached: " + myRobot.distanceSensor.checkSensor());
    myRobot.distanceSensor.setCurrentValue(10);
    System.out.println("Current Value: " + myRobot.distanceSensor.getCurrentValue());
    System.out.println("Threshold Reached: " + myRobot.distanceSensor.checkSensor());
    myRobot.drive.action(myRobot.distanceSensor.checkSensor());

}

}
