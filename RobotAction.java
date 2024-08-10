public class RobotAction {
private String actionName = "Drive";
public void action(boolean state) {
    if(state) {
    System.out.println(actionName + " is Being Performed.");
    }
}
}
