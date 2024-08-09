public class Lasagna {
    public static class LasagnaDefinition {
    //Part One
    private static final double LASAGNA_MINUTES_IN_OVEN = 40;
    private static final double PREPARATION_TIME_PER_LAYER = 2;
public double expectedMinutesInOven() {
    return LASAGNA_MINUTES_IN_OVEN;
}
//Part Two

public double remaingMinutesInOven(double timeInOven) {
    return LASAGNA_MINUTES_IN_OVEN - timeInOven;
}

public double preparationTimeForLayers(int layersCount) {
    return layersCount*PREPARATION_TIME_PER_LAYER;
}
//Part Three
public double totalTimeInMinutes(double timeInOven, int layers) {
return timeInOven + preparationTimeForLayers(layers);
}
    }
    public static void main(String[] args) {
        LasagnaDefinition myLasagna = new LasagnaDefinition();
        System.out.println("Expected Time: " + myLasagna.expectedMinutesInOven());
        System.out.println(myLasagna.remaingMinutesInOven(20));
        System.out.println(myLasagna.preparationTimeForLayers(3));
        System.out.println(myLasagna.totalTimeInMinutes(20, 3));
    }
}
