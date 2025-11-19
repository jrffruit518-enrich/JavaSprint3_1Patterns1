package sprint3Tasca_S301Nivel3;

import sprint3Tasca_S301Nivel3.command.CarAccelerateCommand;
import sprint3Tasca_S301Nivel3.command.CarBrakeCommand;
import sprint3Tasca_S301Nivel3.command.CarStartCommand;
import sprint3Tasca_S301Nivel3.vehicle.Car;

public class CommandClient {
    public static void main(String[] args) {
        Car car = new Car("My BMW");
        CarStartCommand carStartCommand = new CarStartCommand(car);
        CarAccelerateCommand carAccelerateCommand = new CarAccelerateCommand(car);
        CarBrakeCommand carBrakeCommand = new CarBrakeCommand(car);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0,carStartCommand,carAccelerateCommand,carBrakeCommand);

        remoteControl.pressStartCommandButton(0);
        remoteControl.pressUndoCommandButton();
        System.out.println("********************");

        remoteControl.pressAccelerateCommandButton(0);
        remoteControl.pressUndoCommandButton();
        System.out.println("********************");

        remoteControl.pressBrakeCommandButton(0);
        remoteControl.pressUndoCommandButton();
    }
}
