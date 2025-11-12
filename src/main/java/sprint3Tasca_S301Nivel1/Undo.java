package sprint3Tasca_S301Nivel1;

import java.util.Deque;
import java.util.ArrayDeque;


public class Undo {
    private Deque<String> commands = new ArrayDeque<>();

    private Undo() {
    }
    private static class  UndoInstance{
        private static final Undo undo = new Undo();
    }
    public static Undo getInstance(){
        return UndoInstance.undo;
    }

    public void addCommand(String command) {
        if (command != null && !command.trim().isEmpty()) {
            this.commands.push(command);
        } else {
            System.out.println("Please enter valid command.");
        }
    }

    public void undoCommand() {
        if (!this.commands.isEmpty()) {
            String undo = commands.pop();
            System.out.println("Undo :" + undo);
        } else {
            System.out.println("There is no command to undo.");
        }
    }

    public void showCommandHistory() {
        if (!this.commands.isEmpty()) {
            System.out.println("*************");
            this.commands.forEach(System.out::println);
            System.out.println("*************");
        } else {
            System.out.println("No commands in history.");
        }
    }
}
