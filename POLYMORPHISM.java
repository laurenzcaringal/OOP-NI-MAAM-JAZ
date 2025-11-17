// Parent class
class Vehicle {

    // Overloaded methods (Compile-Time Polymorphism)
    void info() {
        System.out.println("This is a vehicle");
    }

    void info(String brand) {
        System.out.println("Brand: " + brand);
    }

    void info(String brand, int year) {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }

    void info(String brand, String model, String color, int year, String fuel) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Fuel: " + fuel);
    }

    // Method to be overridden
    void speed() {
        System.out.println("Vehicle speed varies.");
    }
}

// Subclass 1 - Car
class Car extends Vehicle {
    @Override
    void speed() {
        System.out.println("Car runs at 150 km/h.");
    }
}

// Subclass 2 - Motorcycle
class Motorcycle extends Vehicle {
    @Override
    void speed() {
        System.out.println("Motorcycle runs at 140 km/h.");
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle v;

        // CAR
        v = new Car();
        v.info();
        v.info("Toyota");
        v.info("Toyota", 2024);
        v.info("Toyota", "Vios 1.5 G M/T", "Red", 2024, "Gasoline");
        v.speed();

        System.out.println();

        // MOTORCYCLE
        v = new Motorcycle();
        v.info();
        v.info("Yamaha");
        v.info("Yamaha", 2022);
        v.info("Yamaha", "MT-15", "Matte Black", 2022, "Unleaded Fuel");
        v.speed();
    }
}
