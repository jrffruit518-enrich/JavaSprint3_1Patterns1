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
    public void add(String command) {
        this.commands.add(command);
    }

    public void undo() {
        this.commands.removeLast();
    }

    public void history() {
        this.commands.forEach(System.out::println);
    }

}
