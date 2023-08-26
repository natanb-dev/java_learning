package car_dealership;

public class Customer {
    private String name;
    private String address;
    private double cashonhand;

    public Customer(String name, String address, double cashonhand) {
        this.name = name;
        this.address = address;
        this.cashonhand = cashonhand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address += "Atlantica";
        this.address = address;
    }

    public double getCashonhand() {
        return cashonhand;
    }

    public void setCashonhand(double cashonhand) {
        cashonhand += 500;
        this.cashonhand = cashonhand;
    }

    public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
            emp.handleCust(this, finance, vehicle);
    }
}


