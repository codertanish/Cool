public class Lasagna {
    private final double LASAGNA_MINUTES_IN_OVEN = 40;
    private final double PREPARATION_TIME_PER_LAYER = 2;
public double expectedMinutesInOven() {
    return LASAGNA_MINUTES_IN_OVEN;
}

public double remaingMinutesInOven(double timeInOven) {
    return LASAGNA_MINUTES_IN_OVEN - timeInOven;
}

public double remainingMinutesInOven(int layersCount) {
    return layersCount*PREPARATION_TIME_PER_LAYER;
}
}
