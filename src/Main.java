import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WhipTracker tracker = new WhipTracker();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Whip Wizard Service Tracker ---");
            System.out.println("1. Add Client");
            System.out.println("2. Log Service");
            System.out.println("3. View Clients");
            System.out.println("4. View Services");
            System.out.println("5. View Total Revenue");
            System.out.println("6. Exit");
            System.out.print("Choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Car: ");
                    String car = scanner.nextLine();
                    tracker.addClient(name, phone, car);
                    break;
                case "2":
                    System.out.print("Service name: ");
                    String sName = scanner.nextLine();
                    System.out.print("Price: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.print("Date (MM/DD/YYYY): ");
                    String date = scanner.nextLine();
                    tracker.logService(sName, price, date);
                    break;
                case "3":
                    tracker.showClients();
                    break;
                case "4":
                    tracker.showServices();
                    break;
                case "5":
                    tracker.totalRevenue();
                    break;
                case "6":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }
}
