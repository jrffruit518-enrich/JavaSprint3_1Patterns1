package sprint3Tasca_S301Nivel3.command;

import sprint3Tasca_S301Nivel3.vehicle.Vehicle;

public class BicycleStartCommand extends VehicleCommand{
    public BicycleStartCommand(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void execute() {
        vehicle.start();
    }

    @Override
    public void undo() {
        System.out.println("Can not be undo");
    }
}
