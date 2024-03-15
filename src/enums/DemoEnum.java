package enums;

import java.util.Scanner;



public class DemoEnum {

    public static void demoEnum() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please, enter message type to check it priority: ");
            String userInput = sc.next();

            if (isValidMessageType(userInput)) {
                for(Message s : Message.values())
                    if (s.name().equals(userInput))
                        System.out.println(s.getMessagePriority());
                break;
            } else {
                System.out.println("Please, enter valid "
                        + "message type. Only 'A', 'B', 'C' or 'D' are allowed");
                continue;
            }

        }

    }

    private static boolean isValidMessageType(String userInput) {
        for(Message s : Message.values())
            if (s.name().equals(userInput))
                return true;
        return false;
    }
}
