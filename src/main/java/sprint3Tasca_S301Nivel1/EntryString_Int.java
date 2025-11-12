package sprint3Tasca_S301Nivel1;

import java.util.Scanner;

public class EntryString_Int {
    private static Scanner sc = new Scanner(System.in);

    public static String readString() {
        while (true) {
            String value = sc.nextLine();
            if (value.trim().isEmpty()) {
                System.out.println("The value can not be void.");
                continue;
            }
            return value;
        }
    }

    public static int readInt(String message) {
        while (true) {
            System.out.print(message);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer.");
            }
        }
    }
}

