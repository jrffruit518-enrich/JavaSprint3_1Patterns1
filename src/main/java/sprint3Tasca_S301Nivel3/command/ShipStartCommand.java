package sprint3Tasca_S301Nivel3.command;

import sprint3Tasca_S301Nivel3.vehicle.Vehicle;

public class ShipStartCommand extends VehicleCommand{
    public ShipStartCommand(Vehicle vehicle) {
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
