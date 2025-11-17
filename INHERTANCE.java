class Vehicle {
    String brand;
    String model;
    int year;

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    int topSpeed;
    String gasolineType;

    void displayInfo() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
        System.out.println("Car runs at : " + topSpeed + " km/h");
        System.out.println("Gasoline Type: " + gasolineType);
    }
}

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.brand = "Toyota";
        myCar.model = "Vios";
        myCar.year = 2020;
        myCar.topSpeed = 160;
        myCar.gasolineType = "Unleaded";

        myCar.start();
        myCar.displayInfo();
    }
}
