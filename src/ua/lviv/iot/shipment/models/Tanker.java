package ua.lviv.iot.shipment.models;

public class Tanker extends Ship {

    /**
     * This coefficient is used to norm the rice calculation.
     */
    public static final int TANKER_COEFFICIENT = 10000;

    private double capacity;
    private DangerLevel dangerLevel;

    public Tanker() {
    }

    public Tanker(double tonnage, int speed, double basePricePerMile, String currency) {
        super(tonnage, speed, basePricePerMile, currency);
    }

    @Override
    public double calculateFinalPrice() {
        return getBasePricePerMile() * getTonnage() * capacity / TANKER_COEFFICIENT;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public DangerLevel getDangerLevel() {
        return dangerLevel;
    }

    public void setDangerLevel(DangerLevel dangerLevel) {
        this.dangerLevel = dangerLevel;
    }

}