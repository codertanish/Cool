public class Lasagna {
    final double LASAGNA_MINUTES_IN_OVEN = 40;
public double expectedMinutesInOven() {
    return LASAGNA_MINUTES_IN_OVEN;
}

public double remaingMinutesInOven(double timeInOven) {
    return LASAGNA_MINUTES_IN_OVEN - timeInOven;
}

public double remainingMinutesInOven(int layersCount) {
    return layersCount*2;
}
}
