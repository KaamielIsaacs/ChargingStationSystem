
public class ChargingStation implements Dockable {

    private final String name;

    private final Vehicle[] vehiclesDocked;

    public ChargingStation(String name, int maxVehicleCapacity) {
        this.name = name;
        this.vehiclesDocked = new Vehicle[maxVehicleCapacity];
    }

    @Override
    public boolean canDock() {
        for (Vehicle vehiclesDocked1 : vehiclesDocked) {
            if (vehiclesDocked1 == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int dock(Vehicle vehicle) {

        for (int i = 0; i < vehiclesDocked.length; i++) {
            if (vehiclesDocked[i] == null) {
                vehiclesDocked[i] = vehicle;
                return i;
            }
        }
        return -1;
    }

    public double calculateTotalChargeNeeded() {
        double totalChargeNeeded = 0;
        for (Vehicle vehiclesDocked1 : vehiclesDocked) {
            if (vehiclesDocked1 != null) {
                totalChargeNeeded = totalChargeNeeded + vehiclesDocked1.maxChargeCapacity - vehiclesDocked1.chargeRemaining;
            }
        }
        return totalChargeNeeded;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Charge needed: " + this.calculateTotalChargeNeeded());

        if (vehiclesDocked[0] == null) {
            System.out.println("Docked Vehicles: ");
            System.out.println("None.");
        } else {
            System.out.println("Docked vehicles:");
            for (Vehicle vehiclesDocked1 : vehiclesDocked) {
                if (vehiclesDocked1 != null) {
                    System.out.println(vehiclesDocked1.getName());
                } else {
                    return;
                }
            }

        }
    }
}
