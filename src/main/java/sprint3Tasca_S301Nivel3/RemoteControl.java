package sprint3Tasca_S301Nivel3;

import sprint3Tasca_S301Nivel3.command.Command;
import sprint3Tasca_S301Nivel3.command.NoCommand;

public class RemoteControl {
    private Command [] startCommands;
    private Command [] accelerateCommands;
    private Command [] brakeCommands;
    private Command undoCommand;

    public RemoteControl() {
        this.startCommands = new Command[4];
        this.accelerateCommands = new Command[4];
        this.brakeCommands = new Command[4];
        for (int i = 0; i < 4; i++) {
            startCommands[i] = new NoCommand();
            accelerateCommands[i] = new NoCommand();
            brakeCommands[i] = new NoCommand();

        }
        this.undoCommand = new NoCommand();
    }

    public void setCommand(int slot,Command startCmd,Command accelerateCmd,Command brakeCmd) {
        startCommands[slot] = startCmd;
        accelerateCommands[slot] = accelerateCmd;
        brakeCommands[slot] = brakeCmd;

    }

    public void pressStartCommandButton(int slot) {
        startCommands[slot].execute();
        undoCommand = startCommands[slot];
    }
    public void pressAccelerateCommandButton(int slot) {
        accelerateCommands[slot].execute();
        undoCommand = accelerateCommands[slot];
    }
    public void pressBrakeCommandButton(int slot) {
        brakeCommands[slot].execute();
        undoCommand = brakeCommands[slot];
    }
    public void pressUndoCommandButton() {
        undoCommand.undo();
    }
}
