package car_dealership;

public class Customer {
    //Attributes. 

    private String name;
    private String address; 
    private double cashOnHand;

    //Constructor
    public Customer(String name,String address, double cashOnHand){
        this.name = name;
        this.address = address;
        if (cashOnHand < 0){
            this.cashOnHand = 0.00;
        }else {
            this.cashOnHand = cashOnHand;
        }
        
    }

    //Getters and Setters
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public double getCashOnHand(){
        return cashOnHand;
    }

    public void setCashOnHand(double ammount){
        cashOnHand += ammount;

    }
}
