package sprint3Tasca_S301Nivel3.command;

import sprint3Tasca_S301Nivel3.vehicle.Vehicle;

public abstract class VehicleCommand implements Command{
    protected final Vehicle vehicle;

    public VehicleCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public abstract void execute();

    @Override
    public abstract void undo();
}
