package sprint3Tasca_S301Nivel1;

public class Operation {

    public void startProgram() {
        menu();
    }

    public void menu() {
        boolean exit = false;
        while (!exit) {
            System.out.println();
            System.out.println("*********MENU*********");
            System.out.println("1. Add command");
            System.out.println("2. Undo command");
            System.out.println("3. Show commands");
            System.out.println("4. Exit");

            int option = EntryString_Int.readInt("Please enter your choice: ");
            switch (option) {
                case 1 -> Undo.getInstance().addCommand(EntryString_Int.readString());
                case 2 -> Undo.getInstance().undoCommand();
                case 3 -> Undo.getInstance().showCommandHistory();
                case 4 -> exit = true;
                default -> System.out.println("Your option is invalid,please try again.");
            }
        }
        System.out.println("Thank you for using this program.");
    }
}
