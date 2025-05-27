import java.util.ArrayList;

public class WhipTracker {
    private ArrayList<Client> clients = new ArrayList<>();
    private ArrayList<Service> services = new ArrayList<>();

    public void addClient(String name, String phone, String car) {
        clients.add(new Client(name, phone, car));
        System.out.println("Client added.");
    }

    public void logService(String serviceName, double price, String date) {
        services.add(new Service(serviceName, price, date));
        System.out.println("Service logged.");
    }

    public void showClients() {
        if (clients.isEmpty()) {
            System.out.println("No clients yet.");
        } else {
            for (Client c : clients) {
                System.out.println(c);
            }
        }
    }

    public void showServices() {
        if (services.isEmpty()) {
            System.out.println("No services logged.");
        } else {
            for (Service s : services) {
                System.out.println(s);
            }
        }
    }

    public void totalRevenue() {
        double total = 0;
        for (Service s : services) {
            total += s.getPrice();
        }
        System.out.println("Total Revenue: $" + total);
    }
}
