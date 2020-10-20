package car_dealership;


public class Employee {

    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle){
        if (finance){
            double total =  vehicle.getPrice() - cust.getCashOnHand();

            if (total <= 0){
                System.out.println("You don't have enough to finance the car.");
            }else{
                runCreditHistory(cust, total);
            }
        }else{
            if ( cust.getCashOnHand() - vehicle.getPrice() <= 0  ){
                System.out.println("You dont have enough cash to buy this car.");
            }else{
                System.out.println("Congratulations on your new car!");
                cust.setCashOnHand( cust.getCashOnHand() - vehicle.getPrice());
            }
        }
    }

    public void runCreditHistory(Customer cust, double doubleAmount){
        System.out.println("The customer " + cust.getName() + " just financed: " + String.valueOf(doubleAmount));
    }
}
