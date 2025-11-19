package sprint3Tasca_S301Nivel3.command;

import sprint3Tasca_S301Nivel3.vehicle.Vehicle;

public class CarAccelerateCommand extends VehicleCommand{
    public CarAccelerateCommand(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void execute() {
        vehicle.accelerate();
    }

    @Override
    public void undo() {
        vehicle.brake();
    }
}
