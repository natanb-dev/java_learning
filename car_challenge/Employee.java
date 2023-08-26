package car_dealership;

public class Employee {
    public void handleCust(Customer cust, boolean finance, Vehicle vehicle) {
            if(finance == true) {
                double loanAmount = vehicle.getPrice() - cust.getCashonhand();
                runCredit(cust, loanAmount);

            } else if (vehicle.getPrice() <= cust.getCashonhand()) {
                processTransaction(cust, vehicle);


            }else {
                System.out.println("customer will need more money for this vehicle");
            }
    }

    public void runCredit(Customer cust, double loanAmount) {
        System.out.println("ran credit history for customer");
        System.out.println("Customer has been approved to purchase");

    }
    public void processTransaction(Customer cust, Vehicle vehicle) {
        System.out.println("O cliente adquiriu o modelo " + vehicle + " pela" +
                " pequena bagatela de  " + vehicle.getPrice());
    }

}
