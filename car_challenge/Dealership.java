package car_dealership;

public class Dealership {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Jonas", "Atlantica", 25000);

        Vehicle vehicle = new Vehicle("Honda", "Accord", 20000);

        Employee emp = new Employee();

        cust1.purchaseCar(vehicle, emp, false);

        Vehicle car = new Vehicle("BMW", "M3", 20000);

    }

}
