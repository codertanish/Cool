public class Robot {
double motorSpeed = 0.0;
final double METERS_PER_FIVE_ROTATIONS = 1; //the number of meters added to a torus launch per every five rotations added to RPM.
double rpm = 0.0;
//analyze distance using AprilTags/Greenlight let x be horizontal distance and y be vertical distance; let the center of the field be (0,0).
double x = 15;
double y = 17;
//set x and y to arbritary values.
public String setMotorSpeed() {
    double distance = Math.hypot(x, y);
    motorSpeed = (distance/METERS_PER_FIVE_ROTATIONS)*5;
    return "Calculated Motor Speed: " + motorSpeed;
}

}
