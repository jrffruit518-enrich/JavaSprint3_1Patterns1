package sprint3Tasca_S301Nivel3.command;

import sprint3Tasca_S301Nivel3.vehicle.Vehicle;

public class BicycleBrakeCommand extends VehicleCommand{
    public BicycleBrakeCommand(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void execute() {
        vehicle.brake();
    }

    @Override
    public void undo() {
        vehicle.accelerate();
    }
}
