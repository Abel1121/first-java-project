public class AdminGuestMode {
    public static void adminGuestMode(String[] args) {
        if (args[0].contains("--admin") && args[0].contains("--guest"))
            System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
        else {
            if (args[0].contains("--admin"))
                System.out.println("Hello, Admin!");
            else
                System.out.println("Hello, Guest!");
        }
    }
}
