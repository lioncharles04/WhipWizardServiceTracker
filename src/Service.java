public class Service {
    private String serviceName;
    private double price;
    private String date;

    public Service(String serviceName, double price, String date) {
        this.serviceName = serviceName;
        this.price = price;
        this.date = date;
    }

    public double getPrice() { return price; }

    @Override
    public String toString() {
        return serviceName + " - $" + price + " on " + date;
    }
}
