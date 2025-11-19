package sprint3Tasca_S301Nivel3.command;

import sprint3Tasca_S301Nivel3.vehicle.Vehicle;

public class AirplaneAccelerateCommand extends VehicleCommand{
    public AirplaneAccelerateCommand(Vehicle vehicle) {
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
