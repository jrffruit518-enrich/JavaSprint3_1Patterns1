package sprint3Tasca_S301Nivel1;

import java.util.ArrayList;
import java.util.List;

public class Undo {
    private List<String> commands = new ArrayList<>();

    public Undo() {
    }
    private static class  UndoInstance{
        private static final Undo undo = new Undo();
    }
    public static synchronized Undo getInstance(){
        return UndoInstance.undo;
    }

    public void addCommand() {
        String command = EntryString_Int.readString();
        this.commands.add(command);
    }

    public void undoCommand() {
        if (!this.commands.isEmpty()) {
            this.commands.removeLast();
        } else {
            System.out.println("There is no command to undo.");
        }
    }

    public void showCommandHistory() {
        if (!this.commands.isEmpty()) {
            this.commands.forEach(System.out::println);
        } else {
            System.out.println("There is no command to undo.");
        }
    }

}
