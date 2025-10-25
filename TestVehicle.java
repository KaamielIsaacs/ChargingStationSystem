
public class TestVehicle extends Vehicle {

    public TestVehicle(String name, int maxChargeCapacity) {
        super.setName(name);
        this.maxChargeCapacity = maxChargeCapacity;
    }

    @Override
    public void printInfo() {
        System.out.println("Name: " + super.getName());
        System.out.println("Charge: " + (chargeRemaining / maxChargeCapacity * 100) + "%");
    }

    @Override
    public double calculateTotalChargeNeeded() {
        return maxChargeCapacity - chargeRemaining;
    }

    public static void main(String[] args) {
        ChargingStation chargePrime = new ChargingStation("Prime", 5);
        TestVehicle dragon = new TestVehicle("Dragon", 500);
        dragon.setChargeRemaining(100);
        System.out.println("> Station info:");
        chargePrime.printInfo();
        System.out.println("> A vehicle can dock at the station: "
                + chargePrime.canDock());
        System.out.println("> Approaching vehicle info:");
        dragon.printInfo();
        int bayNumber = chargePrime.dock(dragon);
        System.out.println("> Vehicle docked in bay number " + bayNumber);
        System.out.println("> Station info:");
        chargePrime.printInfo();
        System.out.println("> A vehicle can dock at the station: "
                + chargePrime.canDock());
        TestVehicle unicorn = new TestVehicle("Unicorn", 500);
        unicorn.setChargeRemaining(100);
        System.out.println("> Approaching vehicle info:");
        unicorn.printInfo();
        bayNumber = chargePrime.dock(unicorn);
        System.out.println("> Vehicle docked in bay number " + bayNumber);
        System.out.println("> Station info:");
        chargePrime.printInfo();
        System.out.println("> A vehicle can dock at the station: "
                + chargePrime.canDock());
    }
}
