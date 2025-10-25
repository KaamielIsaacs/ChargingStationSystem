CSC211 Practical – Charging Station System

Student Details

Name: Kaamiel Isaacs
Student Number: 4129581
Course: CSC211
Year: 2023

⸻

Overview

This project simulates a charging station system for electric vehicles using Java.
It demonstrates object-oriented programming concepts such as inheritance, abstraction, interfaces, and array-based object management.

The system allows:
• Checking if vehicles can dock.
• Docking vehicles in the first available bay.
• Calculating the total charge required for all docked vehicles.
• Displaying information about the station and docked vehicles.

⸻

Files

1. Vehicle.java
   • Abstract class representing a generic vehicle.
   • Fields:
   • name – Vehicle name.
   • chargeRemaining – Current charge.
   • maxChargeCapacity – Maximum charge capacity.
   • Methods:
   • Setters and getters for name, chargeRemaining, and maxChargeCapacity.
   • Abstract methods: printInfo() and calculateTotalChargeNeeded().

2. TestVehicle.java
   • Concrete subclass of Vehicle.
   • Implements:
   • printInfo() – Prints the vehicle name and charge percentage.
   • calculateTotalChargeNeeded() – Returns the remaining charge needed to reach full capacity.
   • Contains main() method to demonstrate docking multiple vehicles at a ChargingStation.

3. ChargingStation.java
   • Implements the Dockable interface.
   • Manages an array of Vehicle objects representing docking bays.
   • Methods:
   • canDock() – Checks if there is an empty bay.
   • dock(Vehicle vehicle) – Docks a vehicle in the first available bay.
   • calculateTotalChargeNeeded() – Calculates the total charge required for all docked vehicles.
   • printInfo() – Displays the station name, total charge required, and a list of docked vehicles.

4. Dockable.java
   • Interface defining docking behavior.
   • Methods:
   • boolean canDock()
   • int dock(Vehicle vehicle)

⸻

Features
• Checks docking availability before adding vehicles.
• Handles multiple vehicles using an array-based docking system.
• Calculates total charge needed dynamically.
• Provides clear console output for both vehicles and station information.

⸻

Notes
• Uses abstract classes and interfaces to model vehicle and docking behavior.
• ChargingStation.printInfo() currently stops printing when a null slot is encountered (optional improvement: replace return with break).
• Minor corrections recommended in Vehicle.java getters to return the actual field instead of a parameter.

⸻
