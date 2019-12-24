package bean;

public class HorseService {
    private Horse horse;
    private Rider rider;

    public HorseService() {
    }//todo gitignore

    public HorseService(Horse horse, Rider rider) {
        this.horse = horse;
        this.rider = rider;
    }

    public Horse getHorse() {
        return horse;
    }

    public void setHorse(Horse horse) {
        this.horse = horse;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    @Override
    public String toString() {
        return "HorseService{" +
                "horse=" + horse +
                ", rider=" + rider +
                '}';
    }
}
