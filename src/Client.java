public class Client {
    private String name;
    private String phone;
    private String car;

    public Client(String name, String phone, String car) {
        this.name = name;
        this.phone = phone;
        this.car = car;
    }

    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getCar() { return car; }

    @Override
    public String toString() {
        return name + " (" + car + ") - " + phone;
    }
}
