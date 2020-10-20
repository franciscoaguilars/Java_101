package car_dealership;

public class Vehicle {
    
    String model;
    int year;
    double price;

    public Vehicle(String model, int year, double price){
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }
}
