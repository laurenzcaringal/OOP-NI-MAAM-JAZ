// Abstract class
abstract class Motorcycle {
    String brand = "Yamaha";

    abstract void startEngine();
    abstract void stopEngine();
    abstract void engineType();   // Abstract method
    abstract void topSpeed();     // Abstract method

    void showBrand() {
        System.out.println("Motorcycle Brand: " + brand);
    }
}

// Subclass Yamaha MT-15
class YamahaMT15 extends Motorcycle {

    @Override
    void startEngine() {
        System.out.println("Yamaha MT-15 engine started using key ignition.");
    }

    @Override
    void stopEngine() {
        System.out.println("Yamaha MT-15 engine stopped.");
    }

    @Override
    void engineType() {
        System.out.println("Engine Type: 155cc Liquid-Cooled 4-Stroke");
    }

    @Override
    void topSpeed() {
        System.out.println("Top Speed: 130 km/h");
    }

    void showModel() {
        System.out.println("Model: Yamaha MT-15 2022");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Motorcycle myMoto = new YamahaMT15();   // Abstraction + Polymorphism

        myMoto.showBrand();
        myMoto.startEngine();
        myMoto.stopEngine();

        // MODEL in the middle
        ((YamahaMT15) myMoto).showModel();

        myMoto.topSpeed();       // Top speed before engine type
        myMoto.engineType();     // Engine type last
    }
}
