public class Ship {
    private final String purpose;
    private final int liftingCapasity;
    private final int releaseDate;
    private final String countryOfRegistration;
    private final int speed;

    public Ship(String purpose, int liftingCapasity, int releaseDate, String countryOfRegistration, int speed) {
        this.purpose = purpose;
        this.liftingCapasity = liftingCapasity;
        this.releaseDate = releaseDate;
        this.countryOfRegistration = countryOfRegistration;
        this.speed = speed;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public int getReleaseDate() {
        return this.releaseDate;
    }

    public int getLiftingCapasity() {
        return this.liftingCapasity;
    }

    public String getCountryOfRegistration() {
        return this.countryOfRegistration;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String toString() {
        return "Ship{purpose='" + this.purpose + "', liftingCapasity=" + this.liftingCapasity + ", releaseDate=" + this.releaseDate + ", countryOfRegistration=" + this.countryOfRegistration + "', speed=" + this.speed + "}";
    }
}