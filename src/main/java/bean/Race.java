package bean;

import java.util.List;

public class Race {
    private List<HorseService> horseServices;
    private double distance;

    public Race() {
    }

    public Race(List<HorseService> horseServices, double distance) {
        this.horseServices = horseServices;
        this.distance = distance;
    }

    public List<HorseService> getHorseServices() {
        return horseServices;
    }

    public void setHorseServices(List<HorseService> horseServices) {
        this.horseServices = horseServices;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Race{" +
                "participants=" + horseServices +
                ", distance=" + distance +
                "km}";
    }
}
