
public abstract class Vehicle {

    private String name;
    protected double chargeRemaining;
    protected double maxChargeCapacity;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setChargeRemaining(double chargeRemaining) {
        this.chargeRemaining = chargeRemaining;
    }

    public double getChargeRemaining() {
        return chargeRemaining;
    }

    public void setMaxChargeCapacity(double maxChargeCapacity) {
        this.maxChargeCapacity = maxChargeCapacity;
    }

    public double getMaxChargeCapacity() {

        return maxChargeCapacity;
    }

    public abstract void printInfo();

    public abstract double calculateTotalChargeNeeded();
}
