package car_dealership;

public class Dealership {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Frank", "Villa Navona", 20000.00);
        Employee employ1 = new Employee();
        Vehicle mustang = new Vehicle("Mustang GT", 1995, 45000.00);

        employ1.handleCustomer(cust1, false, mustang);
      

    }
}
